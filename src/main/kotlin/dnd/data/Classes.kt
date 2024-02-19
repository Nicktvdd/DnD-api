package dnd.data

object Classes {
	private val classes = listOf(
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