package com.dilipkumarg.projects.messagearchive.providers.hangouts

import com.fasterxml.jackson.annotation.JsonAlias


data class HangoutConversation(
        val type: Type,
        @JsonAlias("participant_data")
        val participants: Array<Participant>
)

data class Participant(
        val id: ParticipantId,
        @JsonAlias("fallback_name")
        val fallbackName: String

)

data class ParticipantId(
        @JsonAlias("ga_id")
        val gaId: String,
        @JsonAlias("chat_id")
        val chatId: String
)

enum class Type {
    STICKY_ONE_TO_ONE,
    GROUP
}

