package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Board;
import model.Member;

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

    public List<Member> selectBoardByMember(String user_id) {
        try (SqlSession session = factory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            List<Member> selectBoardByMember = mapper.selectBoardByMember(user_id);

            return selectBoardByMember;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Board selectBoard(Long id) {
        Board board = null;
        try (SqlSession session = factory.openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);
            board = mapper.selectBoard(id);            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return board;
    }

    public void updateBoard(Board board) {

    }

    public void deleteBoard(Long id) {
        
    }
}
