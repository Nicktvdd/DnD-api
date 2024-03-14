package dnd.services.characterServices

import dnd.data.model.races.*
import kotlin.reflect.full.memberProperties

fun getRaceFeatures(race: String): Map<String, String?> {
	val raceInstance = when (race) {
		"Human" -> Human()
		"Dwarf" -> Dwarf()
		"Dragonborn" -> Dragonborn()
		"Elf" -> Elf()
		"Half-Elf" -> HalfElf()
		"Gnome" -> Gnome()
		"Halfling" -> Halfling()
		"Half-Orc" -> HalfOrc()
		"Tiefling" -> Tiefling()
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
		is Elf -> {
			Elf::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is HalfElf -> {
			HalfElf::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is Gnome -> {
			Gnome::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is Halfling -> {
			Halfling::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is HalfOrc -> {
			HalfOrc::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		is Tiefling -> {
			Tiefling::class.memberProperties.associateBy({ it.name }, { it.get(raceInstance)?.toString() })
		}
		// Add other races here...
		else -> mapOf("Error" to "Race not found")
	}
}