package dao;
import model.Member;

public interface MemberMapper {
    public int insertMember(Member member);
    public Member selectMemberById(String user_id);
    public int updateMember(Member member);
    public int deleteMember(String user_id);
}
