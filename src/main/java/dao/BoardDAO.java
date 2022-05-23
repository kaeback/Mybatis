package dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Board;

public class BoardDAO {
    
    private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

    public void insertBoard(Board board) {
        try (SqlSession session = factory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            mapper.insertBoard(board);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public Board selectBoardById(Long id) {
        Board board = null;
        try (SqlSession session = factory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            board = mapper.selectBoardById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return board;
    }

    public Map<String, String> selectBoardAndMemberById(Long id) {
        HashMap<String, String> result = null;
        try (SqlSession session = factory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            result = (HashMap<String, String>) mapper.selectBoardAndMemberById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return result;
    }

    public void updateBoard(Board board) {

    }

    public void deleteBoard(Long id) {
        
    }
}
