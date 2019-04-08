package com.example.flywayherokudemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlywayHerokuDemoApplication

fun main(args: Array<String>) {
    runApplication<FlywayHerokuDemoApplication>(*args)
}
