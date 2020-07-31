package com.github.jiangkang.androidstudioplugins.services

import com.intellij.openapi.project.Project
import com.github.jiangkang.androidstudioplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
