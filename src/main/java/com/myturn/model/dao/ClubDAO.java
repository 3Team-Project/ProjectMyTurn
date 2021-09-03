package com.myturn.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.myturn.model.vo.ClubVO;

@Mapper
public interface ClubDAO {
	
	public String createClub(ClubVO cVo);
	
	public void joinClub();
	
	public ClubVO searchClub(String clubId);
	
	public void outClub(String userId);//모임 탈퇴
	
	public ClubVO viewClubShortIntro(ClubVO cVo); //간단한 모임 설명 보기
	
	public ClubVO viewClubDetailIntro(ClubVO cVo); //자세한 모임 설명 보기
	
	public boolean checkPw(String userId, String userPw);
	
	
	
}
