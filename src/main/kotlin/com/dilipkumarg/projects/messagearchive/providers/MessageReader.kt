package com.dilipkumarg.projects.messagearchive.providers

import com.dilipkumarg.projects.messagearchive.models.Message
import reactor.core.publisher.Flux
import java.io.InputStream

interface MessageReader {

    fun read(stream: InputStream): Flux<Message>
}