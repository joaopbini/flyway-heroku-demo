package com.example.flywayherokudemo.person.service.impl

import com.example.flywayherokudemo.person.model.Person
import com.example.flywayherokudemo.person.repository.PersonRepository
import com.example.flywayherokudemo.person.service.PersonService
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl(private val personRepository: PersonRepository) : PersonService {

    override fun getAll(): List<Person> {
        return personRepository.findAll().toList()
    }

}
