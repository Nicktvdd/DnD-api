package dnd.routes

import dnd.services.CharacterGenerator
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.p
import io.ktor.http.*
import io.ktor.server.html.*


fun Route.randomCharacter() {
	get("/randomcharacter") {
		val character = CharacterGenerator.generateRandomCharacter()
		call.respond(character)
	}
}

fun Route.htmlcharacter() {
	get("/htmlcharacter") {
		val character = CharacterGenerator.generateRandomCharacter()
		call.respondHtml(HttpStatusCode.OK) {
			body {
				h1 { +"Generated Character" }
				p { +"Name: ${character.name}" }
				p { +"Race: ${character.race}" }
				p { +"Class: ${character.characterClass}" }
				p { +"Background: ${character.background}" }
				p { +"Alignment: ${character.alignment}" }
				// Add more character details here...
			}
		}
	}
}
