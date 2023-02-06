package com.example.todoapp.extensions

import android.app.Activity
import android.text.Editable

fun Activity.validateMy(text: Editable?): String? {
    return if (text.toString().length > 3) null else "error"
}