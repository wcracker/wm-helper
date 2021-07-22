package com.github.wcracker.wmhelper.services

import com.github.wcracker.wmhelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
