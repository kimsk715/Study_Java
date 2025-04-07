package com.app.domain.vo;

import java.util.Objects;

public class PostVO {
	private Long id;
	private String postTitle;
	private String postContent;
	private int postReadCount;
	private Long memberId;
	private String createdDate;
	private String updatedDate;
	public PostVO() {
		super();
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
		PostVO other = (PostVO) obj;
		return Objects.equals(id, other.id);
	}


	public String getPostTitle() {
		return postTitle;
	}


	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


	public String getPostContent() {
		return postContent;
	}


	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}


	public int getPostReadCount() {
		return postReadCount;
	}


	public void setPostReadCount(int postReadCount) {
		this.postReadCount = postReadCount;
	}


	public Long getMemberId() {
		return memberId;
	}


	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}


	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	public String getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postReadCount="
				+ postReadCount + ", memberId=" + memberId + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}
	

	
	
	
//	ID NUMBER CONSTRAINT PK_POST PRIMARY KEY,
//	POST_TITLE VARCHAR2(1000) NOT NULL,
//	POST_CONTENT VARCHAR2(1000) NOT NULL,
//	POST_READ_COUNT NUMBER DEFAULT 0,
//	MEMBER_ID NUMBER NOT NULL,
//	CREATED_DATE DATE DEFAULT SYSDATE,
//	UPDATED_DATE DATE DEFAULT SYSDATE,
//	CONSTRAINT FK_POST_MEMBER FOREIGN KEY(MEMBER_ID)
//	REFERENCES TBL_MEMBER(ID)	
}
