package com.jpanj.depend.circle;

public class HealthTask {

    private HealthRecord record;

    private String taskName;

    private Integer initialHealthPoint;

    public HealthTask(HealthRecord record, String taskName, Integer initialHealthPoint) {
        this.record = record;
        this.taskName = taskName;
        this.initialHealthPoint = initialHealthPoint;
    }

    public Integer calculateHealthPointForTask() {
        Integer healthPointFromHealthLevel = 12 / record.getHealthLevel();

        return initialHealthPoint + healthPointFromHealthLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getInitialHealthPoint() {
        return initialHealthPoint;
    }
}
