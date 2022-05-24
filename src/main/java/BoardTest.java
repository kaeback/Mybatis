

import java.util.List;
import java.util.Map;

import dao.BoardDAO;
import model.Board;
import model.Member;

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

    public void findBoardByMember() {
        String user_id = "hong";
        List<Member> selectBoardByUser = dao.selectBoardByMember(user_id);

        for (Member member : selectBoardByUser) {
            System.out.println(member);
        }
    }

    public void findBoard() {
        Long id = 7L;
        Board board = dao.selectBoard(id);
        System.out.println("board : " + board);
    }

    public static void main(String[] args) {
        BoardTest boardTest = new BoardTest();
        // boardTest.createBoard();
        // boardTest.findBoardById();
        // boardTest.findBoardAndMemberById();
        // boardTest.findBoardByMember();
        boardTest.findBoard();
    }
}
