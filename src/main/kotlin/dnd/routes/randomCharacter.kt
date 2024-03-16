package dnd.routes

import dnd.services.CharacterGenerator
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.application.*


fun Route.randomCharacter() {
	get("/randomcharacter") {
		val character = CharacterGenerator.generateRandomCharacter()
		call.respond(character)
	}
}
