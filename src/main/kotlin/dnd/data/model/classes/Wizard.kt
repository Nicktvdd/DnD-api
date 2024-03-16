package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Wizard: Class() {
	override val hitDie: Int = 6
	override val primaryAbility: String = "Intelligence"
	override val skills: List<String> = listOf("Arcana", "History", "Insight", "Investigation", "Medicine", "Religion")
	override val armor: List<String> = listOf("None")
	override val weaponProficiencies: List<String> = listOf("Daggers", "Darts", "Slings", "Quarterstaffs", "Light crossbows")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Intelligence", "Wisdom")
	override val skillProficiencies: List<String> = listOf("Arcana", "History")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a quarterstaff or (b) a dagger\n" +
			"(a) a component pouch or (b) an arcane focus\n" +
			"(a) a scholar's pack or (b) an explorer's pack\n" +
			"A spellbook"
	override val startingGold: String = calculateStartingGold(4, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Spellcasting" to "As a student of arcane magic, you have a spellbook containing spells that show the first glimmerings of your true power.",
		"Arcane Recovery" to "You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose expended spell slots to recover."
	)
}