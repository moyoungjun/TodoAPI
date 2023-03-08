package com.example.todoserver

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@Service
class TodoServerService(
    private val repository: TodoServerRepository
    ) {
    fun replaceTodoServer(@PathVariable id: Int, @RequestBody newtodo: TodoServer): TodoServer? {

        val updatedtodoserver = repository.findById(id)
            .map { todo: TodoServer ->
                todo.role = newtodo.role
                todo.name = newtodo.name
                todo.todo = newtodo.todo
                repository.save(todo)
            }
            .orElseGet {
                newtodo.id = id
                repository.save(newtodo)
            }
        return updatedtodoserver


    }
    var arryList = ArrayList<String>()
    fun duplica(arrayList: ArrayList<String>): Boolean {

        return arrayList.size != arrayList.distinct().count()
    }
}