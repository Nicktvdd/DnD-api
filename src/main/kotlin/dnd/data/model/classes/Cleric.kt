package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Cleric: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Wisdom"
	override val skills: List<String> = listOf("History", "Insight", "Medicine", "Persuasion", "Religion")
	override val armor: List<String> = listOf("Light armor", "Medium armor", "Shields")
	override val weaponProficiencies: List<String> = listOf("Simple weapons")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Wisdom", "Charisma")
	override val skillProficiencies: List<String> = listOf("Choose two from History, Insight, Medicine, Persuasion, and Religion")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a mace or (b) a warhammer (if proficient)\n" +
			"(a) scale mail, (b) leather armor, or (c) chain mail (if proficient)\n" +
			"(a) a light crossbow and 20 bolts or (b) any simple weapon\n" +
			"(a) a priest's pack or (b) an explorer's pack\n" +
			"A shield and a holy symbol"
	override val startingGold: String = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Spellcasting" to "As a conduit for divine power, you can cast cleric spells.",
		"Divine Domain" to "Choose one domain related to your deity: Knowledge, Life, Light, Nature, Tempest, Trickery, or War. Each domain is detailed at the end of the class description, and each one provides examples of gods associated with it. Your choice grants you domain spells and other features when you choose it at 1st level."
	)
}