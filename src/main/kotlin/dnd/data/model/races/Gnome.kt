package dnd.data.model.races

class Gnome : Race() {
	val subRace = "Forest Gnome"
	override val abilityScoreIncreases = mapOf(
		"Dexterity" to 1,
		"Intelligence" to 2,
	)
	override val size =
		"Small"
	val sizeDescription =
		"Gnomes are between 3 and 4 feet tall and average about 40 pounds. Your size is Small."
	override val speed =
		"25 feet"
	override val age =
		"Gnomes mature at the same rate humans do, and most are expected to settle down into an adult life by around age 40. They can live 350 to almost 500 years."
	override val languages =
		"You can speak, read, and write Common and Gnomish."
	val darkvision =
		"You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."
	val gnomeCunning =
		"You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic."
	val naturalIllusionist =
		"You know the minor illusion cantrip. Intelligence is your spellcasting ability for it."
	val speakWithSmallBeasts =
		"Through sounds and gestures, you can communicate simple ideas with Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets."
}