package aisw.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aisw.web.biz.BoardDAO;
import aisw.web.biz.BoardVO;

@Controller
public class BoardListController {
	
	@Autowired
	private BoardDAO boardDAO;

	//전체목록
	@RequestMapping("/boardList")
	public String boardList(Model model) throws ClassNotFoundException, SQLException {
		
		List<BoardVO> boardList = boardDAO.getBoardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	
	//게시글 하나
	@RequestMapping("/board")
	public String board(Model model, Integer b_no) throws ClassNotFoundException, SQLException {
		
	    // 조회수 증가
        boardDAO.increaseHitCount(b_no);
		
        BoardVO board = boardDAO.getBoard(b_no);
        model.addAttribute("board", board);
		return "board/board";
	}
	
	//글등록
	@RequestMapping("/insertBoardPage")
	public String insertBoardPage(Model model) throws ClassNotFoundException, SQLException {
		
		return "board/insertBoard";
	}
	
	@RequestMapping("/insertBoard")
	public String insertBoard(Model model, BoardVO board) throws ClassNotFoundException, SQLException {
		
        int result = boardDAO.insertBoard(board);

        if (result == 1) {
            model.addAttribute("msg", "공지가 등록되었습니다.");
            model.addAttribute("url", "boardList");
            return "alert/alert_success";
        } else {
            model.addAttribute("msg", "공지 등록에 실패하였습니다. 잠시후 다시 시도해주세요.");
            model.addAttribute("url", "boardList");
        }
        return "alert/alert_warning";
	}
	
	//게시글 삭제
	@RequestMapping("/deleteBoard")
	public String boardDelete(Model model, Integer b_no) throws ClassNotFoundException, SQLException {
		
		int result = boardDAO.deleteBoard(b_no);
		
		if (result == 1) {
            model.addAttribute("msg", "게시글이 삭제되었습니다.");
            model.addAttribute("url", "boardList");
            return "alert/alert_success";
        } else {
            model.addAttribute("msg", "게시글 삭제에 실패하였습니다. 잠시후 다시 시도해주세요.");
            model.addAttribute("url", "boardList");
        }
        return "alert/alert_warning";
	}

	//게시글 수정
	@RequestMapping("/updateBoardPage")
	public String updateBoardPage(Model model ,Integer b_no) throws ClassNotFoundException, SQLException {
		
		BoardVO board = boardDAO.getBoard(b_no);
        model.addAttribute("board", board);
		
		return "board/updateBoard";
	}
	
	@RequestMapping("/updateBoard")
	public String updateBoard(Model model, BoardVO board) throws ClassNotFoundException, SQLException {
		
		int result = boardDAO.updateBoard(board);
		
		if (result == 1) {
			model.addAttribute("msg", "게시글이 수정되었습니다.");
			model.addAttribute("url", "boardList");
			return "alert/alert_success";
		} else {
			model.addAttribute("msg", "게시글 수정에 실패하였습니다. 잠시후 다시 시도해주세요.");
			model.addAttribute("url", "boardList");
		}
		return "alert/alert_warning";
	}
	
}

