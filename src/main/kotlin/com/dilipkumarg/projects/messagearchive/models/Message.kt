package com.dilipkumarg.projects.messagearchive.models

import java.time.LocalDateTime

data class Message(
        val id: Int,
        val type: MessageType,
        val content: String,
        val from: String,
        val to: String,
        val sentAt: LocalDateTime,
        val receivedAt: LocalDateTime?
)

enum class MessageType {
    TEXT,
    LINK
}
