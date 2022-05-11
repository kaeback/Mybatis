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

    public void updateMember(Member member) {
        try (SqlSession session = factory.openSession()) {
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            int result = mapper.updateMember(member);

            if (result > 0) {
                System.out.println("Member 정보 update 성공");
                session.commit();
            } else {
                System.out.println("Member 정보 update 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteMember(String id) {
        try (SqlSession session = factory.openSession()) {
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            int result = mapper.deleteMember(id);

            if (result > 0) {
                System.out.println("Member 정보 delete 성공");
                session.commit();
            } else {
                System.out.println("Member 정보 delete 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        Member member = new Member("1234", "홍길동");
        // DB에 Member 객체 정보 insert 하기
        dao.insertMember(member);
        /*
        // hong 이라는 아이디를 가진 Member 정보 select 하기
        Member searchedMember = dao.selectMemberById("hong");
        System.out.println("============ 수정 전 ============ ");
        System.out.println(searchedMember);

        // hong 이라는 아이디를 가진 Member의 정보 update 하기
        searchedMember.setName("홍길순");
        dao.updateMember(searchedMember);
        System.out.println("============ 수정 후 ============ ");
        searchedMember = dao.selectMemberById("hong");
        System.out.println(searchedMember);

        // hong 이라는 아이디를 가진 Member의 정보 delete 하기
        //dao.deleteMember(searchedMember.getId());
         */
    }
}
