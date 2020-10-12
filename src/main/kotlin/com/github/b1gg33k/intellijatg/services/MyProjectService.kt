package com.github.b1gg33k.intellijatg.services

import com.intellij.openapi.project.Project
import com.github.b1gg33k.intellijatg.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
