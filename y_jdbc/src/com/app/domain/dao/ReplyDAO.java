package com.app.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.configuration.Configuration;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.ReplyVO;

public class ReplyDAO {
	   private Connection connection;
	   private PreparedStatement preparedStatement;
	   private ResultSet resultSet;
	   
//	   추가
	   public void insert(ReplyVO replyVO) {
		   String query = "INSERT INTO TBL_REPLY "
		   		+ "(ID, REPLY_CONTENT, POST_ID, MEMBER_ID, CREATED_DATE, UPDATED_DATE) "
		   		+ "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE)";
		   
		   connection = Configuration.getConnection();
		   try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	         try {
	             if (preparedStatement != null) {
	                preparedStatement.close();
	             }
	             if (connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             throw new RuntimeException();
	          }

	   }
	   
	   
	   
	   

}
//	   수정
	   public void update(ReplyVO replyVO){
		   String query = "UPDATE TBL_REPLY "
		   		+ "SET REPLY_CONTENT=?, UPDATED_DATE=SYSDATE "
		   		+ "WHERE ID= ? ";
	
		   connection = Configuration.getConnection();
		
				try {
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, replyVO.getReplyContent());
					preparedStatement.setLong(2, replyVO.getId());
					preparedStatement.executeUpdate();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	finally {
			         try {
			             if (preparedStatement != null) {
			                preparedStatement.close();
			             }
			             if (connection != null) {
			                connection.close();
			             }
			          } catch (SQLException e) {
			             throw new RuntimeException();
			          }

			   }
		   
		   
	   }
		  
	   
//	   삭제
	   
	   public void delete(Long id) {
		   String query = "DELETE FROM TBL_REPLY "
				  + "WHERE ID = ?";
		   
		   connection = Configuration.getConnection();
			
			try {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setLong(1, id);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	finally {
		         try {
		             if (preparedStatement != null) {
		                preparedStatement.close();
		             }
		             if (connection != null) {
		                connection.close();
		             }
		          } catch (SQLException e) {
		             throw new RuntimeException();
		          }

		   }
	   }
//	   전체 목록
		public ArrayList<ReplyDTO> selectAll(Long id) {		
			String query = "SELECT R.ID, R.REPLY_CONTENT, R.POST_ID, MEMBER_ID , R.CREATED_DATE, R.UPDATED_DATE, M.MEMBER_NAME "
					+ "FROM TBL_MEMBER M "
					+ "JOIN TBL_REPLY R "
					+ "ON R.MEMBER_ID = M.ID AND R.POST_ID = ?";
					
			ReplyDTO reply = null;
			ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
			
			connection = Configuration.getConnection();
			try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				reply = new ReplyDTO();
				reply.setId(resultSet.getLong("R.ID"));
				reply.setReplyContent(resultSet.getString("R.REPLY_CONTENT"));
				reply.setPostId(resultSet.getLong("R.POST_ID"));
				reply.setMemberId(resultSet.getLong("R.MEMBER_ID"));
				reply.setCreatedDate(resultSet.getString("R.CREATED_DATE"));
				reply.setUpdatedDate(resultSet.getString("R.UPDATED_DATE"));
				reply.setMemberName(resultSet.getNString("M.MEMBER_NAME"));
	            replies.add(reply);
		}
				
			} catch (SQLException e) {
				
			} finally {
				try {
					if(resultSet!=null) {
						resultSet.close();
						}
					if(preparedStatement != null) {
						preparedStatement.close();
						}
					if(connection!=null) {
						connection.close();
						} 
					}
				catch (SQLException e) {
						// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException();
					}
				
			}
				return replies;
			
		}
	   	
}
