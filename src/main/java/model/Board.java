package model;

public class Board {
    private Long id;
    private String user_id;
    private String title;
    private String content;
    private Long hit;
    private String input_time;
    private String last_modified_time;
    private User member;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Long getHit() {
        return hit;
    }
    
    public void setHit(Long hit) {
        this.hit = hit;
    }
    
    public String getInput_time() {
        return input_time;
    }
    
    public void setInput_time(String input_time) {
        this.input_time = input_time;
    }
    
    public String getLast_modified_time() {
        return last_modified_time;
    }
    
    public void setLast_modified_time(String last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public User getMember() {
        return member;
    }

    public void setMember(User member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Board [id=" + id + ", content=" + content + ", hit=" + hit + ", input_time=" + input_time
                + ", last_modified_time=" + last_modified_time + ", title=" + title + ", user_id=" + user_id + "]" + member.toString();
    }
    
}
