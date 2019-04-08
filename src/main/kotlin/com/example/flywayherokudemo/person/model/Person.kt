package com.example.flywayherokudemo.person.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Int? = null,

        var firstName: String? = null,

        var lastName: String? = null

)
