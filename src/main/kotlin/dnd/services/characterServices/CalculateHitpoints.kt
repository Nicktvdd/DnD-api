package dnd.services.characterServices

import dnd.data.Hitpoints
import dnd.services.characterServices.abilityScores.calculateAbilityModifier

fun calculateHitpoints(characterClass: String, constitution: Number): Int {
	val hitpoints = Hitpoints()

	val hitPointsPerLevelForClass = hitpoints.hitPointsPerLevel[characterClass] ?: 8
	val baseHitPoints = hitPointsPerLevelForClass + calculateAbilityModifier(constitution.toInt())

	return baseHitPoints
}
