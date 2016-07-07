package com.example.user.testdb;

public class CardsModel {
    private String idTitle;
    private String title;
    private String body;
    private String createDate;
    private String startDate;
    private String deadline;
    private String likes;

    public CardsModel(String idTitle, String title,  String body,
            String createDate, String startDate, String deadline, String likes) {
        this.idTitle = idTitle;
        this.title = title;
        this.body = body;
        this.createDate = createDate;
        this.startDate = startDate;
        this.deadline = deadline;
        this.likes = likes;
    }

    public String getIdTitle() {
        return idTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getLikes() {
        return likes;
    }
}