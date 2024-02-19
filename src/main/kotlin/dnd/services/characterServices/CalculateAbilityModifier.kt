package dnd.services.characterServices

fun calculateAbilityModifier(abilityScore: Int): Int {
	return (abilityScore - 10) / 2
}
