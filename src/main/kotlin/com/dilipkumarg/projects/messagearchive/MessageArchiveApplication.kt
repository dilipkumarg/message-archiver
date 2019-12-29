package com.dilipkumarg.projects.messagearchive

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MessageArchiveApplication {

    @Bean
    fun objectMapper() = jacksonObjectMapper();
}

fun main(args: Array<String>) {
    runApplication<MessageArchiveApplication>(*args)
}
