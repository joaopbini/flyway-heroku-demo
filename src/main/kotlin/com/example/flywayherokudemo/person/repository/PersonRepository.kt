package com.example.flywayherokudemo.person.repository

import com.example.flywayherokudemo.person.model.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<Person, Long>
