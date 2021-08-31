package com.myturn.model.dao;

import com.myturn.model.vo.ClubVO;

public interface ClubDAO {
	
	public String createClub(ClubVO cVo);
	
	public void joinClub();
	
	public ClubVO searchClub(String clubId);
	
	public void deleteClub(String userId);
	
}
