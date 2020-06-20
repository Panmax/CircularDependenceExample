package com.jpanj.depend.transfer;

public class HealthTask {

    private String taskName;

    private Integer initialHealthPoint;

    public HealthTask(String taskName, Integer initialHealthPoint) {
        this.taskName = taskName;
        this.initialHealthPoint = initialHealthPoint;
    }

    public Integer calculateHealthPointForTask(HealthLevelHandler handler) {
        Integer healthPointFromHealthLevel = 12 / handler.getHealthLevel();

        return initialHealthPoint + healthPointFromHealthLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getInitialHealthPoint() {
        return initialHealthPoint;
    }
}
