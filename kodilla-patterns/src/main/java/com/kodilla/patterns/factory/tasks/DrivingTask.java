package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName,final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String executeTask() {
        return taskName + where + using;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
