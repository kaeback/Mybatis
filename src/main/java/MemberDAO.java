import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDAO {
    private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

    public void connectionTest() {
        SqlSession session = null;
        try {
            session = factory.openSession();
            System.out.println("SqlSession 생성");
            // 데이터베이스 작업...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            System.out.println("SqlSession 종료");
        }
    }

    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        dao.connectionTest();
    }
}
