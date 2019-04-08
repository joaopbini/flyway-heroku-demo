package com.example.flywayherokudemo.person.api

import com.example.flywayherokudemo.person.model.Person
import com.example.flywayherokudemo.person.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonApi(private val personService: PersonService) {

    @GetMapping
    fun getAll(): List<Person> {
        return personService.getAll()
    }

}