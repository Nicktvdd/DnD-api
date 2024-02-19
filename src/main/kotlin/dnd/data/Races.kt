package dnd.data

object Races {
	private val races = listOf(
		"Human",
		"Elf",
		"Dwarf",
		"Halfling",
		"Dragonborn",
		"Gnome",
		"Half-Elf",
		"Half-Orc",
		"Tiefling"
	)

	fun random(): String {
		return races.random()
	}
}