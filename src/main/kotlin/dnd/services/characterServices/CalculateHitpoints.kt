package dnd.services.characterServices

import dnd.data.Hitpoints

fun calculateHitpoints(characterClass: String, constitution: Number): Int {
	val hitpoints = Hitpoints()

	val hitPointsPerLevelForClass = hitpoints.hitPointsPerLevel[characterClass] ?: 8
	val baseHitPoints = hitPointsPerLevelForClass + calculateAbilityModifier(constitution.toInt())

	return baseHitPoints
}
