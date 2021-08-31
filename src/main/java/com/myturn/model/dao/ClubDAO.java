package com.myturn.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.myturn.model.vo.ClubVO;

@Mapper
public interface ClubDAO {
	
	public String createClub(ClubVO cVo);
	
	public void joinClub();
	
	public ClubVO searchClub(String clubId);
	
	public void deleteClub(String userId);
	
}
