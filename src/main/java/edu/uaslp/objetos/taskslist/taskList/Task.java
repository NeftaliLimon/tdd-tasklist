package edu.uaslp.objetos.taskslist.taskList;
import edu.uaslp.objetos.taskslist.exceptions.TaskListException;

import java.time.LocalDateTime;

public class Task {
    String Title, Description;
    LocalDateTime DueDate;
    boolean isDone=false;

    public Task(String title, String description, LocalDateTime dueDate, boolean isdone) {
        this.Title = title;
        this.Description = description;
        this.DueDate = dueDate;
        this.isDone = isdone;
    }
    public Task(){}
    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDueDate(LocalDateTime dueDate) {
        LocalDateTime now = LocalDateTime.now();
        DueDate = dueDate;
        if (dueDate.isBefore(now)) {
            throw new TaskListException("Due date is set in the past");
        }
        DueDate = dueDate;
    }

    public LocalDateTime getDueDate() {
        return DueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isdone) {
        this.isDone = isdone;
    }
}
