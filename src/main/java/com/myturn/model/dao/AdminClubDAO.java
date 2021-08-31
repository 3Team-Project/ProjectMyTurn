package com.myturn.model.dao;

import com.myturn.model.vo.ClubVO;

public interface AdminClubDAO {	
	
	public String adminUpdateClub(ClubVO cVo);
	
	public String adminAdmitMember(ClubVO cVo);
	
	public String adminDeleteMember();
	
	public String adminDeleteClub();
}
