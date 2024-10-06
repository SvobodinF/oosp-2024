package patterns.builder;

import patterns.builder.models.Task;

public class Entrypoint {
    public static void main(String[] args) {
        Task task = new Task.TaskBuilder()
                .setDescription("TEST TASK")
                .setPriority(2)
                .setDueDate("6-10-2024")
                .build();

        System.out.println(task);
    }
}
