package dnd.services

import dnd.data.model.DndCharacter
import kotlin.random.Random

object CharacterGenerator {
	private val races = listOf("Human", "Elf", "Dwarf", "Halfling", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling")
	private val classes = listOf("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard")
	private val backgrounds = listOf("Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin")
	private val alignments = listOf("Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil")

	fun generateRandomCharacter(): DndCharacter {
		val random = Random.Default

		val character = DndCharacter(
			name = "Character-${random.nextInt(1000)}",
			race = races.random(),
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

	private fun randomAbilityScore(): Int {
		// Implement logic to generate random ability scores (e.g., rolling a 6-sided die)
		return (1..6).map { Random.Default.nextInt(1, 7) }.sortedDescending().take(3).sum()
	}
}