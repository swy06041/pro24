package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

/*@Transactional(propagation=Propagation.REQUIRED) */
public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List listMembers() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	public void addMember(MemberVO memberVO) throws DataAccessException {
		memberDAO.insertMember(memberVO);
	}

	@Override
	public void delMember(String id) throws DataAccessException {
		memberDAO.deleteMember(id);
	}

	@Override
	public MemberVO modMember(String id) throws DataAccessException {
		MemberVO membersList = memberDAO.modMember(id);
		return membersList;
	}

	@Override
	public void updateMember(MemberVO memberVO) throws DataAccessException {
		memberDAO.updateMember(memberVO);
	}

	@Override
	public List searchMemberName(String name) throws DataAccessException {
		List membersList = memberDAO.searchMemberName(name);
		return membersList;
	}

	@Override
	public List searchMemberEmail(String email) throws DataAccessException {
		List membersList = memberDAO.searchMemberEmail(email);
		return membersList;
	}

	@Override
	public List searchMemberFirst(String name) throws DataAccessException {
		List membersList = memberDAO.searchMemberFirst(name);
		return membersList;

	}
}
