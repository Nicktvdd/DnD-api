package dnd.services.characterServices.abilityScores

import dnd.data.model.races.*

fun calculateAbilityScoreIncrease(race: String, abilityScores: MutableMap<String, Int>): MutableMap<String, Int> {
	val raceInstance = when (race) {
		"HalfOrc" -> HalfOrc()
		"Human" -> Human()
		"Dwarf" -> Dwarf()
		"Dragonborn" -> Dragonborn()
		"Elf" -> Elf()
		"HalfElf" -> HalfElf()
		"Gnome" -> Gnome()
		"Halfling" -> Halfling()
		"Tiefling" -> Tiefling()
		// Add other races here...
		else -> null
	}

	val raceAbilityScoreIncreases = raceInstance?.abilityScoreIncreases ?: mapOf()

	return abilityScores.mapValues { (key, value) ->
		value + (raceAbilityScoreIncreases[key] ?: 0)
	}.toMutableMap()
}