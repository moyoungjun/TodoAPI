package com.example.todoserver


import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todoserver")
class TodoserverController(
    val repository: TodoServerRepository,
    val service: TodoServerService
) {

    @GetMapping("/{id}")
    fun todogetid(@PathVariable id: Int): TodoServer {
        val toid: TodoServer = repository.findById(id)
            .orElseThrow { TodoServerNotFoundException(id) }
        return toid

    }

    @GetMapping
    fun toso(): List<TodoServerResponse> {
        var result2 = repository.findAll().map { exam: TodoServer -> TodoServerResponse(exam) }
        return result2
    }

    @PostMapping
    fun todopost(@RequestBody newtodoserver: TodoServer): TodoServer {
        var postresult = repository.save(newtodoserver)
        return postresult
    }
    @PutMapping("/{id}")
    fun replacetodo(@PathVariable id: Int, @RequestBody newtodo: TodoServer): TodoServer? {
        val result = service.replaceTodoServer(id, newtodo)
        return result
    }

    @DeleteMapping("/{id}")
    fun deletetodoserver(@PathVariable id: Int) {
        return repository.deleteById(id)
    }
}