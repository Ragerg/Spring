package aisw.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aisw.web.biz.BoardDAO;
import aisw.web.biz.BoardVO;

@Controller
public class BoardListController {
	
	@Autowired
	private BoardDAO boardDAO;

	@RequestMapping("/boardList")
	public String boardList(Model model) throws ClassNotFoundException, SQLException {
		
		List<BoardVO> boardList = boardDAO.getBoardList();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	
	@RequestMapping("/board")
	public String board(Model model, Integer b_no) throws ClassNotFoundException, SQLException {
		
        BoardVO board = boardDAO.getBoard(b_no);
        model.addAttribute("board", board);
		return "board";
	}
	
	@RequestMapping("/insertBoardPage")
	public String insertBoardPage(Model model) throws ClassNotFoundException, SQLException {
		
		return "insertBoard";
	}
	
	@RequestMapping("/insertBoard")
	public String insertBoard(Model model, BoardVO board) throws ClassNotFoundException, SQLException {
		
        int result = boardDAO.insertBoard(board);

        if (result == 1) {
            model.addAttribute("msg", "공지가 등록되었습니다.");
            model.addAttribute("url", "boardList");
            return "alert_success";
        } else {
            model.addAttribute("msg", "공지 등록에 실패하였습니다. 잠시후 다시 시도해주세요.");
            model.addAttribute("url", "boardList");
        }
        return "alert_warning";
	}
	
}
