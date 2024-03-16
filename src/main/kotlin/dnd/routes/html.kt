package dnd.routes

import dnd.services.CharacterGenerator
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun Route.htmlcharacter() {
	get("/htmlcharacter") {
		val character = CharacterGenerator.generateRandomCharacter()
		call.respondHtml(HttpStatusCode.OK) {
			body {
				h1 { +character.name }
				p { +"Race: ${character.race}" }
				p { +"Class: ${character.characterClass}" }
				p { +"Background: ${character.background}" }
				p { +"Alignment: ${character.alignment}" }
				hr {  }
				h2 { +"Ability Scores" }
				p { +"Strength: ${character.abilityScores["Strength"]} (+${character.abilityModifiers["Strength"]})" }
				p { +"Dexterity: ${character.abilityScores["Dexterity"]} (+${character.abilityModifiers["Dexterity"]})" }
				p { +"Constitution: ${character.abilityScores["Constitution"]} (+${character.abilityModifiers["Constitution"]})" }
				p { +"Intelligence: ${character.abilityScores["Intelligence"]} (+${character.abilityModifiers["Intelligence"]})" }
				p { +"Wisdom: ${character.abilityScores["Wisdom"]} (+${character.abilityModifiers["Wisdom"]})" }
				p { +"Charisma: ${character.abilityScores["Charisma"]} (+${character.abilityModifiers["Charisma"]})" }
				p { +"Proficiency Bonus: +${character.proficiencyBonus}" }
				p { +"Initiative: +${character.initiative}" }
				p { +"Passive Perception: ${character.passivePerception}" }
				hr {  }
				h2 { +"Character Details" }
				p {
					+character.characterDetails.personalityTraits.joinToString(", ")
				}
				p { +"Ideals: ${character.characterDetails.ideals[0]}" }
				p { +"Bonds: ${character.characterDetails.bonds[0]}" }
				p { +"Flaws: ${character.characterDetails.flaws[0]}" }
				hr {  }
				h2 { +"HP" }
				p { +"Hit Points: ${character.hitPoints}" }
				p { +"Hit Dice: ${character.hitDice}" }
				hr {  }
				h2 { +"Features" }
				h3 { +"Race Features" }
				character.raceFeatures.forEach { (key, value) ->
					p { +"$key: $value" }
				}
				h3 { +"Class Features" }
				character.classFeatures.forEach { (key, value) ->
					p { +"$key: $value" }
				}
				h3 { +"Background Features" }
				character.backgroundFeatures.forEach { (key, value) ->
					p { +"$key: $value" }
				}


				// Add more character details here...
			}
		}
	}
}