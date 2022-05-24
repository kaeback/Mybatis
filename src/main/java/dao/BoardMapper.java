package dao;

import java.util.List;
import java.util.Map;

import model.Board;
import model.Member;

public interface BoardMapper {
    public int insertBoard(Board board);
    public Board selectBoardById(Long id);
    public Map<String, String> selectBoardAndMemberById(Long id);
    public List<Member> selectBoardByMember(String user_id);
    public Board selectBoard(Long id);

    public int updateBoard(Board board);
    public int deleteBoard(Long id);

    public List<Board> selectAllBoard();
}
