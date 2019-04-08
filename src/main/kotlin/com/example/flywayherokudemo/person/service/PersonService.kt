package com.example.flywayherokudemo.person.service

import com.example.flywayherokudemo.person.model.Person

interface PersonService {

    fun getAll(): List<Person>

}