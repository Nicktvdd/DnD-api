package dnd.services.characterServices

import dnd.data.model.classes.*
import kotlin.reflect.full.memberProperties

fun getClassFeatures(className: String): Map<String, String?> {
	val classInstance = when (className) {
		"Fighter" -> Fighter()
		"Barbarian" -> Barbarian()
		"Wizard" -> Wizard()
		"Rogue" -> Rogue()
		"Paladin" -> Paladin()
		"Monk" -> Monk()
		"Bard" -> Bard()
		"Ranger" -> Ranger()
		"Sorcerer" -> Sorcerer()
		"Warlock" -> Warlock()
		"Druid" -> Druid()
		"Cleric" -> Cleric()
		"Artificer" -> Artificer()
		//"Artificer" -> Artificer()
		// Add other classes here...
		else -> null
	}

	return when (classInstance) {
		is Fighter -> {
			Fighter::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Barbarian -> {
			Barbarian::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Wizard -> {
			Wizard::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Rogue -> {
			Rogue::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Paladin -> {
			Paladin::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Monk -> {
			Monk::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Bard -> {
			Bard::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Ranger -> {
			Ranger::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Sorcerer -> {
			Sorcerer::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Warlock -> {
			Warlock::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Druid -> {
			Druid::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Cleric -> {
			Cleric::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		is Artificer -> {
			Artificer::class.memberProperties.associateBy({ it.name }, { it.get(classInstance)?.toString() })
		}
		// Add other classes here...
		else -> mapOf("Error" to "Class not found")
	}
}