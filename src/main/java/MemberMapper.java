public interface MemberMapper {
    public int insertMember(Member member);
    public Member selectMemberById(String id);
    public int updateMember(Member member);
    public int deleteMember(String id);
}
