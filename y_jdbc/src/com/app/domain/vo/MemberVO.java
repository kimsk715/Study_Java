package com.app.domain.vo;

import java.util.Objects;

public class MemberVO {
	private Long id;
	private String memberEmail;
	private String memberPassWord;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String createdDate;
	private String updateDate;
	
	
	public MemberVO() {;}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassWord() {
		return memberPassWord;
	}
	public void setMemberPassWord(String memberPassWord) {
		this.memberPassWord = memberPassWord;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassWord=" + memberPassWord
				+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberGender=" + memberGender
				+ ", createdDate=" + createdDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}



//CREATE TABLE TBL_MEMBER(
//		ID NUMBER CONSTRAINT PK_MEMBER PRIMARY KEY,
//		MEMBER_EMAIL VARCHAR2(1000) NOT NULL,
//		MEMBER_PASSWORD VARCHAR2(1000) NOT NULL,
//		MEMBER_NAME VARCHAR2(1000) NOT NULL,
//		MEMBER_AGE NUMBER DEFAULT 0,
//		MEMBER_GENDER VARCHAR2(1000) DEFAULT '선택 안함',
//		CREATED_DATE DATE DEFAULT SYSDATE,
//		UPDATED_DATE DATE DEFAULT SYSDATE
//	)