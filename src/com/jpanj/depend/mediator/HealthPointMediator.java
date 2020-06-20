package com.jpanj.depend.mediator;

public class HealthPointMediator {

    private HealthRecord record;

    public HealthPointMediator(HealthRecord record) {
        this.record = record;
    }

    public Integer calculateHealthPointForTask(HealthTask task) {
        Integer healthPointFromHealthLevel = 12 / record.getHealthLevel();
        return task.getInitialHealthPoint() + healthPointFromHealthLevel;
    }
}
