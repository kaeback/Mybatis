package dao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Member;

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

    public Member selectMembermap(String user_id) {
        try (SqlSession session = factory.openSession()) {
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            Member member = mapper.selectMemberMap(user_id);
            return member;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
