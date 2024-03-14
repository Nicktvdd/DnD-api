package dnd.data.model.races

class Human : Race() {
	override val abilityScoreIncreases = mapOf(
		"Strength" to 1,
		"Dexterity" to 1,
		"Constitution" to 1,
		"Intelligence" to 1,
		"Wisdom" to 1,
		"Charisma" to 1
	)
	override val size = "Medium"
	val sizeDescription = "Humans vary widely in height and build, from barely 5 feet to well over 6 feet tall. Regardless of your position in that range, your size is Medium."
	override val speed = "30 feet"
	override val age = "Humans reach adulthood in their late teens and live less than a century."
	override val languages = "You can speak, read, and write Common and one extra language of your choice."
}