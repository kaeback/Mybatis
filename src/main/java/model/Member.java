package model;

import java.util.List;
import java.util.ArrayList;

public class Member {
    private String user_id;
    private String password;
    private String name;
    private List<Board> boardList = new ArrayList<>();

    public Member() {}

    public Member(String user_id, String password, String name) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Board> getBoardList() {
        return boardList;
    }

    public void setBoardList(List<Board> boardList) {
        this.boardList = boardList;
    }

    public String boardListToString() {
        StringBuffer sb = new StringBuffer();
        for (Board board : boardList) {
            sb.append(board.toString());
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", password=" + password + ", user_id=" + user_id + "]" + boardListToString();
    }
    
}
