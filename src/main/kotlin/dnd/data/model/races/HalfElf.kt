package dnd.data.model.races

class HalfElf : Race() {
	val abilities =
		listOf("Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom")
	val randomAbilities =
		abilities.shuffled().take(2)
	override val abilityScoreIncreases = mapOf(
		"Charisma" to 2,
		randomAbilities[0] to 1,
		randomAbilities[1] to 1
	)
	override val size =
		"Medium"
	val sizeDescription =
		"Half-elves are about the same size as humans, ranging from 5 to 6 feet tall. Your size is Medium."
	override val speed =
		"30 feet"
	override val age =
		"Humans reach adulthood in their late teens and live less than a century."
	override val languages =
		"You can speak, read, and write Common and one extra language of your choice."
}