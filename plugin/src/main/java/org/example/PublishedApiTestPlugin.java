package org.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class PublishedApiTestPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().register("myTask", CustomTask.class);
    }
}
