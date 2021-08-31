package com.myturn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myturn.model.dao.ClubDAO;
import com.myturn.model.vo.ClubVO;

@Controller
public class ClubController {
	
	ClubDAO clubDao;
	
	@RequestMapping("club/createClub")
	public void newClub() {
	
	}
	
	@RequestMapping
	public String clubCreate(@ModelAttribute ClubVO cVo) {
		
		clubDao.createClub(cVo);
		
		return "redirect:/board/index";
	}
}
