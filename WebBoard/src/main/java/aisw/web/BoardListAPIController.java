package aisw.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aisw.web.biz.BoardDAO;
import aisw.web.biz.BoardVO;

@RestController
public class BoardListAPIController {
	
	@Autowired
	private BoardDAO boardDAO;

	//API : 전체목록
	@GetMapping("/api/news")
	public ResponseEntity<List<BoardVO>> boardListAPI() throws ClassNotFoundException, SQLException {
		
		List<BoardVO> boardList = boardDAO.getBoardList();
		return ResponseEntity.ok(boardList);
	}
	
	// API: 개별 게시글
	@GetMapping("/api/news/{b_no}")
	public ResponseEntity<BoardVO> boardAPI(@PathVariable Integer b_no) throws ClassNotFoundException, SQLException {
		
		// 조회수 증가
		boardDAO.increaseHitCount(b_no);
		
		BoardVO board = boardDAO.getBoard(b_no);
		return ResponseEntity.ok(board);
	}
	
	// API: 글 등록
	@PostMapping("/api/news")
	public ResponseEntity<String> insertBoardAPI(BoardVO board) throws ClassNotFoundException, SQLException {
		
        int result = boardDAO.insertBoard(board);

        if (result == 1) {
            return ResponseEntity.ok("공지가 등록되었습니다.");
        } else {
            return ResponseEntity.status(500).body("공지 등록에 실패하였습니다. 잠시 후 다시 시도해주세요.");
        }
	}
	
	// API: 글 삭제
	@DeleteMapping(value="/api/news/{b_no}", produces = "text/json; charset=UTF-8")
	public ResponseEntity<String> deleteBoardAPI(@PathVariable("b_no") Integer b_no) throws ClassNotFoundException, SQLException {

	    int result = boardDAO.deleteBoard(b_no);

	    if (result == 1) {
            return ResponseEntity.ok().body("{\"message\": \"게시글이 삭제되었습니다.\"}");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"message\": \"게시글 삭제에 실패하였습니다. 잠시 후 다시 시도해주세요.\"}");
        }
    }
	
	// API: 글 수정
	@PostMapping(value="/api/news/{b_no}", produces = "text/json; charset=UTF-8")
	public ResponseEntity<String> updateBoardAPI(BoardVO board, @PathVariable("b_no") Integer b_no) throws ClassNotFoundException, SQLException {

		board.setB_no(b_no);
		
	    int result = boardDAO.updateBoard(board);

	    if (result == 1) {
	        return ResponseEntity.ok("게시글이 수정되었습니다.");
	    } else {
	        return ResponseEntity.status(500).body("게시글 수정에 실패하였습니다. 잠시 후 다시 시도해주세요.");
	    }
	}


}

