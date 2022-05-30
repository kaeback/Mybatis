package dao;

import java.util.List;
import java.util.Map;


import model.Board;

public interface BoardMapper {

    public int insertBoard(Board board);
    public Board selectBoardById(Long id);
    public Map<String, String> selectBoardAndUserById(Long id);
    
    public Board selectBoard(Long id);
    public Board selectBoardResult(Long id);

    public int updateBoard(Board board);
    public int deleteBoard(Long id);

    public List<Board> selectAllBoard();
    public List<Board> selectBoardTitleOrContent(Board board);
}
