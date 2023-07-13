package droidcon.vietnam.fourth

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class ConfSession(
    val speaker: String,
    val talkTitle: String,
    val date: LocalDate
)