package dnd.services.characterServices

import dnd.data.model.races.*
import kotlin.reflect.full.memberProperties

fun getRaceFeatures(race: String): Map<String, String?> {
	val raceInstance = when (race) {
		"Human" -> Human()
		"Dwarf" -> Dwarf()
		"Dragonborn" -> Dragonborn()
		// Add other races here...
		else -> null
	}

	return when (raceInstance) {
		is Human -> {
			Human::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is Dwarf -> {
			Dwarf::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is Dragonborn -> {
			Dragonborn::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		// Add other races here...
		else -> mapOf("Error" to "Race not found")
	}
}