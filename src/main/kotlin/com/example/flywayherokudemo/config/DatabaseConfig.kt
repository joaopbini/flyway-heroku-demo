package com.example.flywayherokudemo.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import javax.sql.DataSource

@Configuration
class DatabaseConfig {

    @Value("\${spring.datasource.url}")
    private val dbUrl: String? = null

    @Value("\${spring.datasource.password}")
    private val password: String? = null

    @Value("\${spring.datasource.username}")
    private val username: String? = null

    @Bean
    fun dataSource(): DataSource {

        val config = HikariConfig()
        config.jdbcUrl = dbUrl
        config.username = username
        config.password = password

        return HikariDataSource(config)
    }

}