package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Warlock: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Charisma"
	override val saves: List<String> = listOf("Wisdom", "Charisma")
	override val skills: List<String> = listOf("Arcana", "Deception", "History", "Intimidation", "Investigation", "Nature", "Religion")
	override val armor: List<String> = listOf("Light armor")
	override val weaponProficiencies: List<String> = listOf("Simple weapons")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Wisdom", "Charisma")
	override val skillProficiencies: List<String> = listOf("Choose two skills from Arcana, Deception, History, Intimidation, Investigation, Nature, and Religion")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a light crossbow and 20 bolts or (b) any simple weapon\n" +
			"(a) a component pouch or (b) an arcane focus\n" +
			"(a) a scholar's pack or (b) a dungeoneer's pack\n" +
			"Leather armor, any simple weapon, and two daggers"
	override val startingGold: String = calculateStartingGold(4, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Otherworldly Patron" to "At 1st level, you have struck a bargain with an otherworldly being of your choice. Your choice grants you features at 1st level and again at 6th, 10th, and 14th level.",
		"Pact Magic" to "Your arcane research and the magic bestowed on you by your patron have given you facility with spells."
	)
}