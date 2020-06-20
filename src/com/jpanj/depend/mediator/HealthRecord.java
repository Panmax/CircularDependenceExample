package com.jpanj.depend.mediator;

import java.util.ArrayList;
import java.util.List;

public class HealthRecord {

    private List<HealthTask> tasks = new ArrayList<>();

    public Integer getHealthLevel() {
        if (tasks.size() > 5) {
            return 1;
        }
        if (tasks.size() < 2) {
            return 3;
        }
        return 2;
    }

    public void addTask(String taskName, Integer initialHealthPoint) {
        HealthTask task = new HealthTask(taskName, initialHealthPoint);
        tasks.add(task);
    }

    public List<HealthTask> getTasks() {
        return tasks;
    }

}
