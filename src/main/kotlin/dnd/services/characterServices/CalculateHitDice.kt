package dnd.services.characterServices

fun calculateHitDice(characterClass: String): String {
	return when (characterClass) {
		"Barbarian" -> "1d12"
		"Bard" -> "1d8"
		"Cleric" -> "1d8"
		"Druid" -> "1d8"
		"Fighter" -> "1d10"
		"Monk" -> "1d8"
		"Paladin" -> "1d10"
		"Ranger" -> "1d10"
		"Rogue" -> "1d8"
		"Sorcerer" -> "1d6"
		"Warlock" -> "1d8"
		"Wizard" -> "1d6"
		else -> "1d8"
	}
}