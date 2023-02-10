package com.example.todoapp.extensions

import android.app.Activity
import android.text.Editable

fun Activity.validateName(text: Editable?): String? {
    return if (text.toString().isNotEmpty()) null else "Поле пустое"
}

fun Activity.validateEmail(text: Editable?): String? {

    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 7 && text.contains("@")) {
            null
        } else {
            "Неверная почта"
        }
    }
    else {
        "Поле не должно быть пустым"
    }

}

fun Activity.validatePass(text: Editable?): String? {

    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 8) {
            null
        } else {
            "Пароль должен содержать больше 8 символов"
        }
    }
    else {
        "Поле не должно быть пустым"
    }
}

fun Activity.validateConf(text: Editable?): String? {
    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 8) {
            null
        } else {
            "Пароль должен содержать больше 8 символов"
        }
    }
    else {
        "Поле не должно быть пустым"
    }
}