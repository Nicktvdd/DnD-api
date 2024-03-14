package dnd.data.model.races

class HalfOrc : Race() {
	override val abilityScoreIncreases = mapOf(
		"Strength" to 2,
		"Constitution" to 1,
	)
	override val size =
		"Medium"
	val sizeDescription =
		"Humans vary widely in height and build, from barely 5 feet to well over 6 feet tall. Regardless of your position in that range, your size is Medium."
	override val speed =
		"30 feet"
	override val age =
		"Half-orcs mature a little faster than humans, reaching adulthood around age 14. They age noticeably faster and rarely live longer than 75 years."
	override val languages =
		"You can speak, read, and write Common and Orcish."
	val darkvision =
		"Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."
	val menacing =
		"You gain proficiency in the Intimidation skill."
	val relentlessEndurance =
		"When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this feature again until you finish a long rest."
	val savageAttacks =
		"When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit."
}