package aisw.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aisw.web.biz.BoardDAO;
import aisw.web.biz.BoardVO;

@Controller
public class BoardListController {
	
	@Autowired
	private BoardDAO boardDAO;
//	
//	public void setBoardDAO(BoardDAO boardDAO) {
//	    this.boardDAO = boardDAO;
//	}
	

	@RequestMapping("/boardList")
	public String boardList(Model model) throws ClassNotFoundException, SQLException {
		
		List<BoardVO> boardList = boardDAO.getBoardList();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		List<BoardVO> boardList = boardDAO.getBoardList();
//
//		ModelAndView mv = new ModelAndView("boardList");
//		mv.addObject("boardList", boardList);
//		
//		
//		
//		return mv;
//	}

}
