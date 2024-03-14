package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Ranger: Class() {
	override val hitDie: Int = 10
	override val primaryAbility: String = "Dexterity"
	override val saves: List<String> = listOf("Strength", "Dexterity")
	override val skills: List<String> = listOf("Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survival")
	override val armor: List<String> = listOf("Light armor", "Medium armor", "Shields")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Martial weapons")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Strength", "Dexterity")
	override val skillProficiencies: List<String> = listOf("Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survival")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) scale mail or (b) leather armor\n" +
			"(a) two shortswords or (b) two simple melee weapons\n" +
			"(a) a dungeoneer's pack or (b) an explorer's pack\n" +
			"A longbow and a quiver of 20 arrows"
	override val startingGold: String = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Favored Enemy" to "Beginning at 1st level, you have significant experience studying, tracking, hunting, and even talking to a certain type of enemy.",
		"Natural Explorer" to "You are particularly familiar with one type of natural environment and are adept at traveling and surviving in such regions."
	)
}