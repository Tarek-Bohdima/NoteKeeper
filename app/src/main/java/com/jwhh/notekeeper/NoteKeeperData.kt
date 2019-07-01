package com.jwhh.notekeeper

/**
 * Created by Tarek on 29-Jun-19.
 */
data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo(var course: CourseInfo? = null, var title: String? = null, var text: String? = null)