package patterns.builder.models;

public class Task {
    private final String description;
    private final int priority;
    private final String dueDate;

    public Task(TaskBuilder builder) {
        this.description = builder.description;
        this.priority = builder.priority;
        this.dueDate = builder.dueDate;
    }
    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }

    public static class TaskBuilder {
        private String description;
        private int priority;
        private String dueDate;
        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder setPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public TaskBuilder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}
