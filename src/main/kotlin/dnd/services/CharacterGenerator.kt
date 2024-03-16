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
import dnd.services.characterServices.abilityScores.calculateAbilityScoreIncrease
import dnd.services.characterServices.abilityScores.rollAbilityScore
import dnd.services.characterServices.features.getBackgroundFeatures
import dnd.services.characterServices.features.getClassFeatures
import dnd.services.characterServices.features.getRaceFeatures

object CharacterGenerator {
	private const val INITIAL_LEVEL = 1
	private const val INITIAL_PROFICIENCY_BONUS = 2

	fun generateRandomCharacter(): DndCharacter {
		val race = Races.random()
		val raceFeatures = getRaceFeatures(race = race)
		val nameGenerator = RandomNameGenerator()
		val randomName = nameGenerator.generateRandomName(race)
		var abilityScores = generateAbilityScores()
		abilityScores = calculateAbilityScoreIncrease(race, abilityScores)
		val abilityModifiers = calculateAbilityModifiers(abilityScores)
		val characterClass = Classes.random()
		val initialHitPoints = calculateHitpoints(characterClass = characterClass, constitution = abilityScores["Constitution"] ?: 10)
		val hitDice = calculateHitDice(characterClass = characterClass)
		val background = Backgrounds.random()



		val character = DndCharacter(
			level = INITIAL_LEVEL,
			proficiencyBonus = INITIAL_PROFICIENCY_BONUS,
			name = randomName,
			race = race,
			characterClass = characterClass,
			background = background,
			alignment = Alignments.random(),
			abilityScores = abilityScores,
			abilityModifiers = abilityModifiers,
			initiative = abilityModifiers["Dexterity"] ?: (0 + if (characterClass == "Bard") 1 else 0),
			passivePerception = abilityModifiers["Wisdom"]?.plus(10) ?: 0,
			characterDetails = DndCharacterDetails(
				personalityTraits = generateRandomPersonalityTraits(),
				ideals = generateRandomIdeals(),
				bonds = generateRandomBonds(),
				flaws = generateRandomFlaws(),
			),
			hitPoints = initialHitPoints,
			hitDice = hitDice,
			raceFeatures = raceFeatures,
			classFeatures = getClassFeatures(characterClass),
			backgroundFeatures = getBackgroundFeatures(background),
		)
		return character
	}

	private fun generateAbilityScores(): MutableMap<String, Int> {
		return mutableMapOf(
			"Strength" to rollAbilityScore(),
			"Dexterity" to rollAbilityScore(),
			"Constitution" to rollAbilityScore(),
			"Intelligence" to rollAbilityScore(),
			"Wisdom" to rollAbilityScore(),
			"Charisma" to rollAbilityScore()
		)
	}

	private fun calculateAbilityModifiers(abilityScores: MutableMap<String, Int>): Map<String, Int> {
		return mapOf(
			"Strength" to calculateAbilityModifier(abilityScores["Strength"] ?: 10),
			"Dexterity" to calculateAbilityModifier(abilityScores["Dexterity"] ?: 10),
			"Constitution" to calculateAbilityModifier(abilityScores["Constitution"] ?: 10),
			"Intelligence" to calculateAbilityModifier(abilityScores["Intelligence"] ?: 10),
			"Wisdom" to calculateAbilityModifier(abilityScores["Wisdom"] ?: 10),
			"Charisma" to calculateAbilityModifier(abilityScores["Charisma"] ?: 10)
		)
	}
}