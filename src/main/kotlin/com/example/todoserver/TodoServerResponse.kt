package com.example.todoserver

data class TodoServerResponse(
    var id: Int?,
    var name: String,
    var role: String,
    var todo: String
)
{
    constructor(todos: TodoServer):this(
        id = todos.id ,
        name = todos.name,
        role = todos.role,
        todo = todos.todo
    )
}
