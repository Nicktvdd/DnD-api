package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Druid: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Wisdom"
	override val skills: List<String> = listOf("Arcana", "Animal Handling", "Insight", "Medicine", "Nature", "Perception", "Religion", "Survival")
	override val armor: List<String> = listOf("Light armor", "Medium armor", "Shields (druids will not wear armor or use shields made of metal)")
	override val weaponProficiencies: List<String> = listOf("Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears")
	override val toolProficiencies: List<String> = listOf("Herbalism kit")
	override val savingThrowProficiencies: List<String> = listOf("Intelligence", "Wisdom")
	override val skillProficiencies: List<String> = listOf("Choose two from Arcana, Animal Handling, Insight, Medicine, Nature, Perception, Religion, and Survival")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a wooden shield or (b) any simple weapon\n" +
			"(a) a scimitar or (b) any simple melee weapon\n" +
			"Leather armor, an explorer's pack, and a druidic focus"
	override val startingGold: String = calculateStartingGold(2, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Druidic" to "You know Druidic, the secret language of druids. You can speak the language and use it to leave hidden messages.",
		"Spellcasting" to "Drawing on the divine essence of nature itself, you can cast spells to shape that essence to your will."
	)
}