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
import dnd.data.model.traits.Alignments
import dnd.services.characterServices.*
import dnd.services.characterServices.abilityScores.calculateAbilityModifier
import dnd.services.characterServices.abilityScores.rollAbilityScore


object CharacterGenerator {
	fun generateRandomCharacter(): DndCharacter {
		val race = Races.random()
		//val raceFeatures = getRaceFeatures(race = race)
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
		val hitPoints = calculateHitpoints(characterClass = characterClass, constitution = abilityScores["Constitution"] ?: 10)
		val hitDice = calculateHitDice(characterClass = characterClass)
		val background = Backgrounds.random()


		val character = DndCharacter(
			level = 1,
			proficiencyBonus = 2,
			name = randomName,
			race = race,
			characterClass = characterClass,
			background = background,
			alignment = Alignments.random(),
			abilityScores = abilityScores,
			abilityModifiers = abilityModifiers,
			characterDetails = DndCharacterDetails(
				personalityTraits = generateRandomPersonalityTraits(),
				ideals = generateRandomIdeals(),
				bonds = generateRandomBonds(),
				flaws = generateRandomFlaws(),
			),
			hitPoints = hitPoints,
			hitDice = hitDice,
			raceFeatures = getRaceFeatures(race),
			classFeatures = getClassFeatures(characterClass),
			backgroundFeatures = getBackgroundFeatures(background)
		)
		return character
	}
}