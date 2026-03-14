package com.app.todoApp.controller;

import com.app.todoApp.model.Task;
import com.app.todoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";     //i wrote tasks because i am using thymeleaf in this project. What it will do is, it will
                            //look for the tasks.html file in the resources/tempelates package and run the file.
    }
}
