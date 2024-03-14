package dnd.services.characterServices.characterDetails


import dnd.data.model.traits.Bonds

fun generateRandomBonds(numBonds: Int = 1): List<String> {
	return Bonds().bonds.shuffled().take(numBonds)
}