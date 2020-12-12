package com.github.nowsprinting.intellijsimpledictionary.services

import com.intellij.openapi.project.Project
import com.github.nowsprinting.intellijsimpledictionary.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
