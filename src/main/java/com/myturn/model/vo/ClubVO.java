package com.myturn.model.vo;

import lombok.Data;

@Data
public class ClubVO {
	private String userId;
	private String clubId;
	private String clubName;
	private String clubShortIntro;
	private String clubDetailIntro;
	private String clubKeyword;
	private String categoryCode;
	private int totalMember;
	private int currentMember;
	//private string clubProfileshot
}
