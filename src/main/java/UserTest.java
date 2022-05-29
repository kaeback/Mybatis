import dao.UserDAO;
import model.User;

public class UserTest {

    private UserDAO userDAO = new UserDAO();
    
    public void createUser() {
        User member = new User("hong", "1234", "홍길동");
        userDAO.insertMember(member);
    }

    public void findUserById() {
        String user_id = "hong";
        User findMember = userDAO.selectMemberById(user_id);
        System.out.println("findMember : " + findMember);
    }

    public void updateUser() {
        String user_id = "hong";
        User findMember = userDAO.selectMemberById(user_id);
        findMember.setName("홍길순");
        userDAO.updateUser(findMember);
        User updateMember = userDAO.selectMemberById(user_id);
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

    public static void main(String[] args) {
        UserTest userTest = new UserTest();
        // memberTest.createMember();
        // memberTest.updateMember();
        userTest.selectUserMap();
    }


}
