package dnd.services.characterServices.abilityScores

fun calculateAbilityModifier(abilityScore: Int): Int {
	return (abilityScore - 10) / 2
}
