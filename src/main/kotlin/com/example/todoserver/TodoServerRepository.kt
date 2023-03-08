package com.example.todoserver

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoServerRepository : JpaRepository<TodoServer, Int> {
}