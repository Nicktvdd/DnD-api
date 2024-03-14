package dnd.data.model.races

class Tiefling : Race() {
	override val abilityScoreIncreases = mapOf(
		"Intelligence" to 1,
		"Charisma" to 2
	)
	override val size =
		"Medium"
	val sizeDescription =
		"Tieflings are about the same size and build as humans. Your size is Medium."
	override val speed =
		"30 feet"
	override val age =
		"Tieflings mature at the same rate as humans but live a few years longer."
	override val languages =
		"You can speak, read, and write Common and Infernal."
	val darkvision =
		"You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."
	val hellishResistance =
		"You have resistance to fire damage."
	val infernalLegacy =
		"You know the thaumaturgy cantrip. Once you reach 3rd level, you can cast the hellish rebuke spell once per day as a 2nd-level spell. Once you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells."
}