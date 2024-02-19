package dnd.services

import dnd.data.model.DndCharacter
import dnd.data.model.DndCharacterDetails
import dnd.services.characterServices.RandomNameGenerator
import dnd.services.characterServices.calculateHitpoints
import dnd.services.characterServices.characterDetails.generateRandomBonds
import dnd.services.characterServices.characterDetails.generateRandomFlaws
import dnd.services.characterServices.characterDetails.generateRandomIdeals
import dnd.services.characterServices.characterDetails.generateRandomPersonalityTraits
import dnd.services.characterServices.rollAbilityScore


object CharacterGenerator {
	private val races = listOf("Human", "Elf", "Dwarf", "Halfling", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling")
	private val classes = listOf("Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard")
	private val backgrounds = listOf("Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin")
	private val alignments = listOf("Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil")

	fun generateRandomCharacter(): DndCharacter {
		val race = races.random()
		val nameGenerator = RandomNameGenerator()
		val randomName = nameGenerator.generateRandomName(race)
		val abilityScores = mapOf(
			"Strength" to rollAbilityScore(),
			"Dexterity" to rollAbilityScore(),
			"Constitution" to rollAbilityScore(),
			"Intelligence" to rollAbilityScore(),
			"Wisdom" to rollAbilityScore(),
			"Charisma" to rollAbilityScore()
		)
		val characterClass = classes.random()
		val hitpoints = calculateHitpoints(characterClass = characterClass, constitution = abilityScores["Constitution"] ?: 10)


		val character = DndCharacter(
			name = randomName,
			race = race,
			characterClass = characterClass,
			background = backgrounds.random(),
			alignment = alignments.random(),
			abilityScores = abilityScores,
			characterDetails = DndCharacterDetails(
				personalityTraits = generateRandomPersonalityTraits(),
				ideals = generateRandomIdeals(),
				bonds = generateRandomBonds(),
				flaws = generateRandomFlaws(),
			),
			hitpoints = hitpoints,
		)
		return character
	}
}