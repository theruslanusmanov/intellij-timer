package com.github.theruslanusmanov.intellijtimer.services

import com.intellij.openapi.project.Project
import com.github.theruslanusmanov.intellijtimer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
