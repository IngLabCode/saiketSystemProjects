package com.saiketsystems;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Finish homework");

        ToDoList toDoList = new ToDoList();
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        task2.markComplete();
        toDoList.displayTasks();
    }
}