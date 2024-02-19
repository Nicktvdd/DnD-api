package dnd.services.characterServices.characterDetails

import dnd.data.Flaws

fun generateRandomFlaws(numFlaws: Int = 1): List<String> {
	return Flaws().flaws.shuffled().take(numFlaws)
}