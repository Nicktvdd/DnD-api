package dnd.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DndCharacterDetails(
	val personalityTraits: List<String>,
	val ideals: List<String>,
	val bonds: List<String>,
	val flaws: List<String>
)

@Serializable
data class DndCharacter(
	val name: String,
	val level: Int,
	val race: String,
	val characterClass: String,
	val background: String,
	val alignment: String,
	val abilityScores: Map<String, Int>,
	val abilityModifiers: Map<String, Int>,
	val proficiencyBonus: Int,
	val initiative: Int,
	val passivePerception: Int,
	val characterDetails: DndCharacterDetails,
	val hitPoints: Int,
	val hitDice: String,
	val raceFeatures: Map<String, String?>,
	val classFeatures: Map<String, String?>,
	val backgroundFeatures: Map<String, String?>
)
