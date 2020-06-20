package com.jpanj.depend.mediator;

public class HealthPointTest {

    public static void main(String[] args) {
        HealthRecord record = new HealthRecord();
        record.addTask("忌烟酒", 5);
        record.addTask("每周跑步3次", 4);
        record.addTask("每天喝2升水", 4);
        record.addTask("晚上10点按时睡觉", 3);
        record.addTask("晚上8点后不再吃东西", 1);

        HealthPointMediator mediator = new HealthPointMediator(record);

        for (HealthTask task : record.getTasks()) {
            System.out.println(mediator.calculateHealthPointForTask(task));
        }
    }

}
