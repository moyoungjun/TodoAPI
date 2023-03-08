package com.example.todoserver



class TodoServerNotFoundException(id: Int) : RuntimeException("advice 에서 쓰는 메세지 Could not found todoserver $id") {
}