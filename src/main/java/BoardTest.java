

import java.util.Map;

import dao.BoardDAO;
import model.Board;

public class BoardTest {
    private BoardDAO dao = new BoardDAO();

    public void createBoard() {
        Board board = new Board();
        board.setUser_id("hong");
        board.setTitle("title");
        board.setContent("content");

        dao.insertBoard(board);
    }

    public void findBoardById() {
        Long id = 7L;
        Board selectBoard = dao.selectBoardById(id);
        System.out.println("selectBoard : " + selectBoard);
    }

    public void findBoardAndMemberById() {
        Long id = 7L;
        Map<String, String> result = dao.selectBoardAndMemberById(id);
        System.out.println("result.name : " + result.get("NAME"));
    }

    public static void main(String[] args) {
        BoardTest boardTest = new BoardTest();
        // boardTest.createBoard();
        // boardTest.findBoardById();
        boardTest.findBoardAndMemberById();
    }
}
