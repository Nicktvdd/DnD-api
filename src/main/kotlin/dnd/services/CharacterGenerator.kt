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
import dnd.data.Races
import dnd.data.Classes
import dnd.data.Backgrounds
import dnd.data.Alignments


object CharacterGenerator {

	fun generateRandomCharacter(): DndCharacter {
		val race = Races.random()
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
		val characterClass = Classes.random()
		val hitpoints = calculateHitpoints(characterClass = characterClass, constitution = abilityScores["Constitution"] ?: 10)


		val character = DndCharacter(
			name = randomName,
			race = race,
			characterClass = characterClass,
			background = Backgrounds.random(),
			alignment = Alignments.random(),
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