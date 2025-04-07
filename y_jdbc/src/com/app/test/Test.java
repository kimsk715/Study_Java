package com.app.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.domain.dao.MemberDAO;
import com.app.domain.dao.PostDAO;
import com.app.domain.dao.ReplyDAO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.domain.vo.ReplyVO;
import com.app.exception.post.PostNotFoundException;

public class Test {
   public static void main(String[] args) {
      MemberDAO memberDAO = new MemberDAO();
      PostDAO postDAO = new PostDAO();
      
//      회원가입 화면
//      String memberEmail = "hgd4444@naver.com";
//      String memberPassword = "5555";
//      String memberName = "신사임당";
//      int memberAge = 20;
//      String memberGender = "여자";
//      
//      MemberVO memberVO = new MemberVO();
//      
//      memberVO.setMemberEmail(memberEmail);
//      memberVO.setMemberPassWord(memberPassword);
//      memberVO.setMemberName(memberName);
//      memberVO.setMemberAge(memberAge);
//      memberVO.setMemberGender(memberGender);
//      
//      System.out.println(memberVO);
//      
//      memberDAO.insert(memberVO);
      
//      로그인
//      String memberEmail = "hds1234@gmail.com";
//      String memberPassword = "fdsfdsf";
//      
//      MemberVO member = new MemberVO();
//      member.setMemberEmail(memberEmail);
//      member.setMemberPassword(memberPassword);
//      
////      System.out.println(memberDAO.selectByMemberEmailAndMemberPassword(member));
//      member = memberDAO.selectByMemberEmailAndMemberPassword(member).orElseThrow(() -> {
//         throw new LoginException("로그인 실패");
//      });
//      
//      System.out.println(member);
      
//      회원 조회
//      Long id = 1L;
//      System.out.println(memberDAO.selectById(id));
      
//      회원 수정
//      Long id = 1L;
//      MemberVO member = memberDAO.selectById(id);
//      
//      member.setMemberName("홍길동");
//      memberDAO.update(member);
      
//      회원 삭제
//      Long id = 1L;
//      MemberVO member = memberDAO.selectById(id);
//      
//      memberDAO.delete(member.getId());
      
//      회원 전체 조회
//      memberDAO.selectAll().forEach((member) -> {
//         System.out.println(member);
//      });
      
//      이메일 중복검사
//      String memberEmail = "hds@gmail.com";
//      Optional<MemberVO> foundMember = memberDAO.selectByMemberEmail(memberEmail);
//      System.out.println(foundMember.isPresent());
      
//      게시글 추가
//      Long memberId = 2L;
//      MemberVO member = memberDAO.selectById(memberId);
//      PostVO post = new PostVO();
//      
//      post.setPostTitle("테스트 제목6");
//      post.setPostContent("테스트 내용6");
//      post.setMemberId(member.getId());
//     
//      postDAO.insert(post);
//      
//     게시글 조회
//      	Optional<PostDTO> foundPost = postDAO.selectById(1L);
//      	foundPost.ifPresent((post) -> {
//         System.out.println(post);
//      	});
//      	PostDTO post = foundPost.orElse(new PostDTO());
//      	System.out.println(post);
//      
//      	PostDTO postDTO = foundPost.orElseThrow(() -> {throw new PostNotFoundException("게시글 조회 실패");});
//      	System.out.println(postDTO);
//      
//      	Long memberId = 2L;
//      	MemberVO member = memberDAO.selectById(memberId);
//      	System.out.println(member);
//      	Optional<PostDTO> foundPost = postDAO.selectById(6L);
//      	PostDTO postDTO = foundPost.orElseThrow(() -> {throw new PostNotFoundException("게시글 조회 실패");});
//      	System.out.println(foundPost);
//      Long postId = 1L;
//      	PostVO postVO = new PostVO();
//      	postVO.setPostTitle("변경 테스트1");
//      	postVO.setPostContent("변경 테스트1");
//      	postVO.setId(member.getId());
//      	postDAO.update(postVO);
      	
//      게시글 삭제(작성한 게시글인지 검사)	
//      postDAO.delete(5L);
//      	boolean check = (postDTO.getMemberId() == member.getId());
//      	System.out.println(check);
//      	
//      	if(check) {
//      		postDAO.delete(postDTO.getId());
//      	}
      	
//      		System.out.println(postDAO.selectAll());
      ReplyVO replyVO = new ReplyVO();
      
      ReplyDAO replyDAO = new ReplyDAO();
//      댓글 생성
//      replyVO.setReplyContent("댓글2");
//      replyVO.setPostId(2L);
//      replyVO.setMemberId(2L);
//      replyDAO.insert(replyVO);
      
//      댓글 조회
//      replyVO.setReplyContent("수정된 댓글1");
//      replyVO.setId(1L);
//      replyDAO.update(replyVO);
//      replyDAO.delete(2L);
      
//    전체 목록(전체 목록 중, 내가 작성한 댓글인지 검사, 그 후 수정&삭제 테스트) 
      
      ReplyVO reply = new ReplyVO();
      MemberVO member = memberDAO.selectById(1L);
      Optional<PostDTO> fountPost = postDAO.selectById(1L);
      PostDTO post = fountPost.orElseThrow(() -> {throw new PostNotFoundException();});
      System.out.println(post);
      ArrayList<ReplyDTO> replies = 
              (ArrayList<ReplyDTO>) replyDAO.selectAll(post.getId()).stream()
                 .filter((replyDTO) -> replyDTO.getMemberId() == member.getId())
                    .collect(Collectors.toList());
      System.out.println(replies);

//        System.out.println(replies);
//        replies.get(0).setReplyContent("수수정정된 댓글");
        
//        reply.setId(replies.get(0).getId());
//        reply.setReplyContent(replies.get(0).getReplyContent());
        
//        수정
//        replyDAO.update(reply);
        
//        삭제
//        replyDAO.delete(replies.get(0).getId());

   }
}























