package com.example.todoserver

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus


@ControllerAdvice
class TodoServerNotFoundAdvice1 {

    @ResponseBody
    @ExceptionHandler(TodoServerNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun TodoServerNotFoundHandler(todo: TodoServerNotFoundException):String?{
        return todo.message
    }

}