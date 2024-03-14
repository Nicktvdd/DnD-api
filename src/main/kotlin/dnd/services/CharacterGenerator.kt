package dnd.services

import dnd.data.model.DndCharacter
import dnd.data.model.DndCharacterDetails
import dnd.services.characterServices.characterDetails.generateRandomBonds
import dnd.services.characterServices.characterDetails.generateRandomFlaws
import dnd.services.characterServices.characterDetails.generateRandomIdeals
import dnd.services.characterServices.characterDetails.generateRandomPersonalityTraits
import dnd.data.Races
import dnd.data.Classes
import dnd.data.Backgrounds
import dnd.data.Alignments
import dnd.services.characterServices.*


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
		val abilityModifiers = mapOf(
			"Strength" to calculateAbilityModifier(abilityScores["Strength"] ?: 10),
			"Dexterity" to calculateAbilityModifier(abilityScores["Dexterity"] ?: 10),
			"Constitution" to calculateAbilityModifier(abilityScores["Constitution"] ?: 10),
			"Intelligence" to calculateAbilityModifier(abilityScores["Intelligence"] ?: 10),
			"Wisdom" to calculateAbilityModifier(abilityScores["Wisdom"] ?: 10),
			"Charisma" to calculateAbilityModifier(abilityScores["Charisma"] ?: 10)
		)
		val characterClass = Classes.random()
		val hitpoints = calculateHitpoints(characterClass = characterClass, constitution = abilityScores["Constitution"] ?: 10)
		val hitdice = calculateHitDice(characterClass = characterClass)


		val character = DndCharacter(
			proficiencyBonus = 2,
			name = randomName,
			race = race,
			characterClass = characterClass,
			background = Backgrounds.random(),
			alignment = Alignments.random(),
			abilityScores = abilityScores,
			abilityModifiers = abilityModifiers,
			characterDetails = DndCharacterDetails(
				personalityTraits = generateRandomPersonalityTraits(),
				ideals = generateRandomIdeals(),
				bonds = generateRandomBonds(),
				flaws = generateRandomFlaws(),
			),
			hitpoints = hitpoints,
			hitdice = hitdice
		)
		return character
	}
}