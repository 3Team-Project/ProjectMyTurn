package com.myturn.model.dao;

import com.myturn.model.vo.ClubVO;

public interface LeaderClubDAO {
	
	public String leaderUpdateClub(ClubVO cVo);
	
	public String leaderAdmitMember(ClubVO cVo);
	
	public String leaderDeleteMember();
	
	public String leaderDeleteClub();
}
