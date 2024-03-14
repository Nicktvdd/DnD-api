package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Sorcerer: Class() {
	override val hitDie: Int = 6
	override val primaryAbility: String = "Charisma"
	override val saves: List<String> = listOf("Constitution", "Charisma")
	override val skills: List<String> = listOf("Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion")
	override val armor: List<String> = listOf("None")
	override val weaponProficiencies: List<String> = listOf("Daggers", "Darts", "Slings", "Quarterstaffs", "Light crossbows")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Constitution", "Charisma")
	override val skillProficiencies: List<String> = listOf("Choose two from Arcana, Deception, Insight, Intimidation, Persuasion, and Religion")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a light crossbow and 20 bolts or (b) any simple weapon\n" +
			"(a) a component pouch or (b) an arcane focus\n" +
			"(a) a dungeoneer's pack or (b) an explorer's pack\n" +
			"Two daggers"
	override val startingGold: String = calculateStartingGold(3, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Spellcasting" to "An event in your past, or in the life of a parent or ancestor, left an indelible mark on you, infusing you with arcane magic. This font of magic, whatever its origin, fuels your spells.",
		"Sorcerous Origin" to "Choose a sorcerous origin, which describes the source of your innate magical power."
	)
}