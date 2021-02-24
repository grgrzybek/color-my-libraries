package com.github.grgrzybek.colormylibraries.services

import com.github.grgrzybek.colormylibraries.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
