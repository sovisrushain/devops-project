package com.cisco.demo.dto;

public class ToDo {
    private String Id;
    private String todo;
    private String status;
    private String priority;
    private String description;

    public ToDo() {
    }

    public ToDo(String id, String todo, String status, String priority, String description) {
        Id = id;
        this.todo = todo;
        this.status = status;
        this.priority = priority;
        this.description = description;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
