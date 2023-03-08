package com.example.todoserver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class TodoServer(
    @Id @GeneratedValue
    var id: Int? = null,
    var role: String,
    var name: String,
    var todo: String
) {

}