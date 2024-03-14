package dnd.data.model.races

class Halfling : Race() {
	override val abilityScoreIncreases = mapOf(
		"Dexterity" to 2,
		"Charisma" to 1
	)
	val subrace =
		"Lightfoot"
	override val size =
		"Small"
	val sizeDescription =
		"Halflings average about 3 feet tall and weigh about 40 pounds. Your size is Small."
	override val speed =
		"25 feet"
	override val age =
		"A halfling reaches adulthood at the age of 20 and generally lives into the middle of his or her second century."
	override val languages =
		"You can speak, read, and write Common and Halfling. The Halfling language isn’t secret, but halflings are loath to share it with others. They write very little, so they don’t have a rich body of literature. Their oral tradition, however, is very strong. Almost all halflings speak Common to converse with the people in whose lands they dwell or through which they are traveling."
	val lucky =
		"When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll."
	val brave =
		"You have advantage on saving throws against being frightened."
	val halflingNimbleness =
		"You can move through the space of any creature that is of a size larger than yours."
	val naturallyStealthy =
		"You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you."
}