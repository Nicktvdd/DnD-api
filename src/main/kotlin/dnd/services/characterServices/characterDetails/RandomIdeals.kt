package dnd.services.characterServices.characterDetails

import dnd.data.Ideals

fun generateRandomIdeals(numIdeals: Int = 1): List<String> {
	return Ideals().ideals.shuffled().take(numIdeals)
}