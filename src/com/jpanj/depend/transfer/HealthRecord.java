package com.jpanj.depend.transfer;

import java.util.ArrayList;
import java.util.List;

public class HealthRecord {

    private List<HealthTask> tasks = new ArrayList<>();

    public HealthLevelHandler getHealthPointHandler() {
        return new HealthLevelHandler(tasks.size());
    }

    public void addTask(String taskName, Integer initialHealthPoint) {
        HealthTask task = new HealthTask(taskName, initialHealthPoint);
        tasks.add(task);
    }

    public List<HealthTask> getTasks() {
        return tasks;
    }

}
