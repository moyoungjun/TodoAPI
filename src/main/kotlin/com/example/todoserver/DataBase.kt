package com.example.todoserver

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class DataBase {
    @Bean
    fun initDataBase(todoserverrepository: TodoServerRepository) = CommandLineRunner {
        todoserverrepository.save(TodoServer(id = 1, role = "a", name = "myj", todo = "개발"))
        todoserverrepository.save(TodoServer(id = 2, role = "b", name = "koq", todo = "기획"))
        todoserverrepository.save(TodoServer(id = 3, role = "c", name = "lqa", todo = "출장"))
        todoserverrepository.save(TodoServer(id = 4, role = "d", name = "jto", todo = "디자인"))
    }

}