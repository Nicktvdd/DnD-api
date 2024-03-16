package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Paladin: Class() {
	override val hitDie: Int = 10
	override val primaryAbility: String = "Strength"
	override val skills: List<String> = listOf("Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion")
	override val armor: List<String> = listOf("All armor", "Shields")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Martial weapons")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Wisdom", "Charisma")
	override val skillProficiencies: List<String> = listOf("Choose two from Athletics, Insight, Intimidation, Medicine, Persuasion, and Religion")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a martial weapon and a shield or (b) two martial weapons\n" +
			"(a) five javelins or (b) any simple melee weapon\n" +
			"(a) a priest's pack or (b) an explorer's pack\n" +
			"Chain Mail and a holy symbol"
	override val startingGold: String = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Divine Sense" to "The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces.",
		"Lay on Hands" to "Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest."
	)
}