package droidcon.vietnam

import droidcon.vietnam.plugins.configureHTTP
import droidcon.vietnam.plugins.configureRouting
import droidcon.vietnam.plugins.configureSerialization
import droidcon.vietnam.plugins.configureSockets
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(
        Netty,
        port = 8080,
        host = "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureSockets()
    configureSerialization()
    configureRouting()
}
