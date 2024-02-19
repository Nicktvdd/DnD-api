package dnd.services

import dnd.data.model.DndCharacter
import dnd.services.characterServices.RandomNameGenerator
import dnd.services.characterServices.randomAbilityScore


object CharacterGenerator {
	private val races = listOf("Human", "Elf", "Dwarf", "Halfling", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling")
	private val classes = listOf("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard")
	private val backgrounds = listOf("Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin")
	private val alignments = listOf("Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil")

	fun generateRandomCharacter(): DndCharacter {
		val race = races.random()
		val nameGenerator = RandomNameGenerator()
		val randomName = nameGenerator.generateRandomName(race)

		val character = DndCharacter(
			name = randomName,
			race = race,
			characterClass = classes.random(),
			background = backgrounds.random(),
			alignment = alignments.random(),
			abilityScores = mapOf(
				"Strength" to randomAbilityScore(),
				"Dexterity" to randomAbilityScore(),
				"Constitution" to randomAbilityScore(),
				"Intelligence" to randomAbilityScore(),
				"Wisdom" to randomAbilityScore(),
				"Charisma" to randomAbilityScore()
			)
		)

		return character
	}
}