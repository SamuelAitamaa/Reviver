package com.example.projektix;

public class Task {
    private int taskNumber;
    private boolean status;
    private String taskName = "Task";

    public Task(String taskName, int taskNumber, boolean status) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.status = status;
    }

    public int getTaskNumber() {
        return this.taskNumber;
    }

    public String toString() {
        return this.taskName;
    }

}
