package com.jacqui.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with intents")
        courses[course.courseId] = course

        course = CourseInfo(courseId = "android_async", title = "Android async programming and services")
        courses[course.courseId] = course

        course = CourseInfo(title="Java fundamentals: The java language", courseId = "Java_lang")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java fundamentals: The Core Platform")
        courses[course.courseId] = course

    }
}