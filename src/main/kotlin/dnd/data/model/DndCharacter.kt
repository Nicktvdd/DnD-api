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
	val race: String,
	val characterClass: String,
	val background: String,
	val alignment: String,
	val abilityScores: Map<String, Int>,
	val abilityModifiers: Map<String, Int>,
	val characterDetails: DndCharacterDetails,
	val hitpoints: Int,
)
