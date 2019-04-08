package com.example.flywayherokudemo

import com.example.flywayherokudemo.person.repository.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlywayHerokuDemoApplication(private val personRepository: PersonRepository) : CommandLineRunner {

    override fun run(vararg args: String) {
        println(this.personRepository.findAll())
    }

}

fun main(args: Array<String>) {
    runApplication<FlywayHerokuDemoApplication>(*args)
}
