import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDAO {
    private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

    public void insertMember(Member member) {
        try (SqlSession session = factory.openSession()) {
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            mapper.insertMember(member);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Member selectMemberById(String id) {
        Member member = null;
        try (SqlSession session = factory.openSession()) {
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            member = mapper.selectMemberById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return member;
    }

    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        Member member = new Member("hong", "1234", "홍길동");
        // DB에 Member 객체 정보 insert 하기
        dao.insertMember(member);

        // hong 이라는 아이디를 가진 Member 정보 select 하기
        Member searchedMember = dao.selectMemberById("hong");
        System.out.println(searchedMember);
    }
}
