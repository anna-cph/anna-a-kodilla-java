package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String description;
    private String listName;
    private List<Task> tasks = new ArrayList<>();

    public TaskList() {

    }

    public TaskList(String description, String listName) {
        this.description = description;
        this.listName = listName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
