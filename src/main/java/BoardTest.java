

import java.util.Map;

import dao.BoardDAO;
import model.Board;

public class BoardTest {

    private BoardDAO dao = new BoardDAO();

    public void createBoard() {
        Board board = new Board();
        board.setUser_id("hong");
        board.setTitle("제목 입니다.");
        board.setContent("내용 입니다.");

        dao.insertBoard(board);
        System.out.println("게시물 등록 완료");
    }

    public void findBoardById() {
        Long id = 1L;
        Board selectBoard = dao.selectBoardById(id);
        System.out.println("selectBoard : " + selectBoard);
    }

    public void findBoardAndUserById() {
        Long id = 1L;
        Map<String, String> result = dao.selectBoardAndUserById(id);
        System.out.println("result.name : " + result.get("NAME"));
    }

    public void findtBoardResult() {
        Long id = 1L;
        Board board = dao.selectBoardResult(id);
        System.out.println("board : " + board);
    }

    public void findBoard() {
        Long id = 1L;
        Board board = dao.selectBoard(id);
        System.out.println("board : " + board);
    }

    public static void main(String[] args) {
        BoardTest boardTest = new BoardTest();
//        boardTest.createBoard();
//        boardTest.findBoardById();
//        boardTest.findBoardAndUserById();
        boardTest.findBoard();
//        boardTest.findtBoardResult();
    }
}
