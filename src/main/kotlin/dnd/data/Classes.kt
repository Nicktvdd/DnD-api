package dnd.data

object Classes {
	private val classes = listOf(
		"Artificer",
		"Barbarian",
		"Bard",
		"Cleric",
		"Druid",
		"Fighter",
		"Monk",
		"Paladin",
		"Ranger",
		"Rogue",
		"Sorcerer",
		"Warlock",
		"Wizard"
	)

	fun random(): String {
		return classes.random()
	}
}