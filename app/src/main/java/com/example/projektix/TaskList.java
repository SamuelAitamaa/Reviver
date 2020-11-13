package com.example.projektix;

import android.view.View;

import java.util.ArrayList;

public class TaskList {
    private static final TaskList ourInstance = new TaskList();
    private final String title = "Task";
    ArrayList<Task> Tasks;


    public static TaskList getInstance() {
        return ourInstance;
    }

    private TaskList() {
        Tasks = new ArrayList<>();
    }

    public Task getTask(int i) {
        return Tasks.get(i);
    }
}


