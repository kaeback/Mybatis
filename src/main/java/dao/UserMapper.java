package dao;
import model.User;

public interface UserMapper {
    public int insertUser(User user);
    public User selectUserById(String user_id);
    public User selectUserMap(String user_id);
    public int updateUser(User user);
    public int deleteUser(String user_id);
    public User selectUser(User user);
}
