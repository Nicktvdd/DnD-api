package dnd.services.characterServices.abilityScores

import kotlin.random.Random

fun rollAbilityScore(): Int {
	// Implement logic to generate random ability scores (e.g., rolling a 6-sided die)
	return (1..6).map { Random.Default.nextInt(1, 7) }.sortedDescending().take(3).sum()
}
