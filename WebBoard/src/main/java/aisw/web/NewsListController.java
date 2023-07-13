package aisw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import aisw.web.biz.BoardVO;
import aisw.web.biz.RestDAO;

@Controller
public class NewsListController {
	
	@Autowired
	private RestDAO restDAO;

	@RequestMapping("/rest/news")
	public String newsList(Model model) throws JsonMappingException, JsonProcessingException {
		
		List<BoardVO> newsList = restDAO.getNewsList();
		model.addAttribute("newsList", newsList);
		return "board/boardList";
	}
	
}

