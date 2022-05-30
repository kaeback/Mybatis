import dao.UserDAO;
import model.User;

public class UserTest {

    private UserDAO userDAO = new UserDAO();
    
    public void createUser() {
        User user = new User("hong", "1234", "홍길동");
        userDAO.insertUser(user);
        System.out.println("유저 생성 성공");
    }

    public void findUserById() {
        String user_id = "hong";
        User findMember = userDAO.selectUserById(user_id);
        System.out.println("findMember : " + findMember);
    }

    public void updateUser() {
        String user_id = "hong";
        User findMember = userDAO.selectUserById(user_id);
        findMember.setName("홍길순");
        userDAO.updateUser(findMember);
        User updateMember = userDAO.selectUserById(user_id);
        System.out.println("updateMember : " + updateMember);
    }

    public void deleteUser() {
        String user_id = "hong";
        userDAO.deleteUser(user_id);
    }

    public void selectUserMap() {
        String user_id = "hong";
        User member = userDAO.selectUserMap(user_id);
        System.out.println(member);
    }
    
    public void selecUser() {
    	User user = new User();
    	user.setUser_id("hong");
    	user.setPassword("1234");
    	User result = userDAO.selectUser(user);
    	System.out.println("result : " + result);
    }

    public static void main(String[] args) {
        UserTest userTest = new UserTest();
//        userTest.createUser();
//        userTest.updateUser();
//        userTest.selectUserMap();
        userTest.selecUser();
    }


}
