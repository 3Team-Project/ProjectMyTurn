package com.myturn.controller;

import java.util.logging.Logger;

import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.myturn.model.dao.ClubDAO;
import com.myturn.model.vo.ClubVO;

@Controller
@RequestMapping("/club")
public class ClubController {
	
	@Autowired
	ClubDAO clubDao;
	
	@RequestMapping("createClub")
	public void newClub() {
	
	}
	
	@RequestMapping
	public String clubCreate(@ModelAttribute ClubVO cVo) {
		
		clubDao.createClub(cVo);
		
		return "redirect:/board/index";
	}
	
	@RequestMapping("joinClub")
	public void clubJoin() {
		
		clubDao.joinClub();
	}
	
	@RequestMapping("shortIntro")
	public void clubViewShortIntro(ClubVO cVo) {
		
		clubDao.viewClubShortIntro(cVo);
	}
	
	@RequestMapping("detailIntro")
	public void clubViewDetailIntro(ClubVO cVo) {
		
		clubDao.viewClubDetailIntro(cVo);
	}
	
	@PostMapping
	public String clubOut(@RequestParam String userId, @RequestParam String userPw, Model model) {
		boolean result = clubDao.checkPw(userId, userPw);
		
		if(result) {
			clubDao.outClub(userId);
			model.addAttribute("message", "모임을 사랑해주셔서 감사합니다");
			return "redirect:/index";
		}else {
			model.addAttribute("message", "알맞은 비밀번호를 입력하세요");
			return "club/board/index";
		}
		
	}

}
