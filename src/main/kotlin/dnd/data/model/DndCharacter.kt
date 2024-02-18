package dnd.data.model

import kotlinx.serialization.Serializable


@Serializable
data class DndCharacter(
	val name: String,
	val race: String,
	val characterClass: String,
	val background: String,
	val alignment: String,
	val abilityScores: Map<String, Int>
)
