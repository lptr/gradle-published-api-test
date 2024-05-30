package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CustomTask extends DefaultTask {
    @TaskAction
    public void customAction() {
        System.out.println("Hello from CustomTask");
    }
}
