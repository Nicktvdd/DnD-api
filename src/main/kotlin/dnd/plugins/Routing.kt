package dnd.plugins

import dnd.routes.htmlcharacter
import dnd.routes.randomCharacter
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
	routing {
		get("/") {
			call.respondText("Hello World!")
		}
		randomCharacter()
		htmlcharacter()
	}
}
