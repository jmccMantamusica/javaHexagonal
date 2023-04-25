package com.hexagonal.tasks.domain.models;

import java.time.LocalDateTime;

public class Task {

    private long id;
    private String title;
    private String description;
    private LocalDateTime createLocalDate;
    private boolean completed;

    public Task(long id, String title, String description,
                LocalDateTime createLocalDate, boolean completed){
        this.id = id;
        this.title = title;
        this.description = description;
        this.createLocalDate = createLocalDate;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateLocalDate() {
        return createLocalDate;
    }

    public void setCreateLocalDate(LocalDateTime createLocalDate) {
        this.createLocalDate = createLocalDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
