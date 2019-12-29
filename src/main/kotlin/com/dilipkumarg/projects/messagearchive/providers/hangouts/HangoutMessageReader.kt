package com.dilipkumarg.projects.messagearchive.providers.hangouts

import com.dilipkumarg.projects.messagearchive.models.Message
import com.dilipkumarg.projects.messagearchive.providers.MessageReader
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.io.InputStream
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@Service
class HangoutMessageReader : MessageReader {

    @Autowired
    lateinit var objectMapper: ObjectMapper;

    override fun read(stream: InputStream): Flux<Message> {

        val map: Map<String, JvmType.Object> = objectMapper.readValue(stream)



        return Flux.create { }
    }

}