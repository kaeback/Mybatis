package dao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.User;

public class UserDAO {
    private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

    public void insertUser(User user) {
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            mapper.insertUser(user);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User selectUserById(String id) {
        User member = null;
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            member = mapper.selectUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return member;
    }

    public void updateUser(User user) {
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            int result = mapper.updateUser(user);

            if (result > 0) {
                System.out.println("User 정보 update 성공");
                session.commit();
            } else {
                System.out.println("User 정보 update 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String id) {
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            int result = mapper.deleteUser(id);

            if (result > 0) {
                System.out.println("User 정보 delete 성공");
                session.commit();
            } else {
                System.out.println("User 정보 delete 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User selectUserMap(String user_id) {
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserMap(user_id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public User selectUser(User user) {
    	try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User result = mapper.selectUser(user);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
