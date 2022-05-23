import dao.MemberDAO;
import model.Member;

public class MemberTest {

    private MemberDAO memberDAO = new MemberDAO();
    
    public void createMember() {
        Member member = new Member("hong", "1234", "홍길동");
        memberDAO.insertMember(member);
    }

    public void findMemberById() {
        String user_id = "hong";
        Member findMember = memberDAO.selectMemberById(user_id);
        System.out.println("findMember : " + findMember);
    }

    public void updateMember() {
        String user_id = "hong";
        Member findMember = memberDAO.selectMemberById(user_id);
        findMember.setName("홍길순");
        memberDAO.updateMember(findMember);
        Member updateMember = memberDAO.selectMemberById(user_id);
        System.out.println("updateMember : " + updateMember);
    }

    public void deleteMember() {
        String user_id = "hong";
        memberDAO.deleteMember(user_id);
    }

    public static void main(String[] args) {
        MemberTest memberTest = new MemberTest();
        // memberTest.createMember();
        memberTest.updateMember();
    }

}
