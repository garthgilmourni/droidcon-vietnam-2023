package droidcon.vietnam.db

import droidcon.vietnam.model.ConfSession
import kotlinx.datetime.LocalDate

object ConfSessions {
    fun buildSessions() = listOf(
        //Day 1
        ConfSession("Alex Castrounis", "Large Language Models: Friend, Foe, or Otherwise", LocalDate(2023, 5, 22)),
        ConfSession("Tim Berglund", "Introduction to Real-Time Analytics With Apache Pinot", LocalDate(2023, 5, 22)),
        ConfSession("Richard Feldman", "Calling Functions Across Languages", LocalDate(2023, 5, 22)),
        ConfSession("Sara Caldwell", "When It’s Time to Change, Then It’s Time To Change", LocalDate(2023, 5, 22)),
        ConfSession("Kasun Indrasiri", "Cloud Native Event Streaming With Kafka and Open Standards", LocalDate(2023, 5, 22)),
        ConfSession("Sam Bail", "Bridging the Gap", LocalDate(2023, 5, 22)),
        // Day 2
        ConfSession("Avdi Grimm", "REPLs All the Way Up: A Rubric for Better Feedback Loops", LocalDate(2023, 5, 23)),
        ConfSession("Fabio Pereira", "The Psychology of UX", LocalDate(2023, 5, 23)),
        ConfSession("Rosemary Wang", "Catching Commits to Secure Infrastructure as Code", LocalDate(2023, 5, 23)),
        ConfSession("Matt Stratton", "Zero Trust is For Networks, Not Your Teams", LocalDate(2023, 5, 23)),
        // Day 3
        ConfSession("Kelly Shortridge", "Practical Magic: the Resilience Potion and Security Chaos Engineering", LocalDate(2023, 5, 24)),
        ConfSession("Garth Gilmour", "Composing All The Things", LocalDate(2023, 5, 24)),
        ConfSession("Hillel Wayne", "Is Software Engineering Real Engineering?", LocalDate(2023, 5, 24)),
        ConfSession("Andrew Kelley", "How to Build Software From Source", LocalDate(2023, 5, 24))
    )
}