package org.example;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class PublishedApiTestPlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Hello from PublishedApiTestPlugin");
    }
}
