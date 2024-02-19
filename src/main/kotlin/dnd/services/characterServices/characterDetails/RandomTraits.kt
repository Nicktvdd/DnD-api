package dnd.services.characterServices.characterDetails

import dnd.data.PersonalityTraits

fun generateRandomPersonalityTraits(numTraits: Int = 1): List<String> {
	val personalityTraits = PersonalityTraits()
	return (0 until numTraits).flatMap {
		if (Math.random() < 0.5) personalityTraits.positiveTraits else personalityTraits.negativeTraits
	}.shuffled()
}