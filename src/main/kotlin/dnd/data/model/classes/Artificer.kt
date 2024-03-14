package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Artificer: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Intelligence"
	override val saves: List<String> = listOf("Constitution", "Intelligence")
	override val skills: List<String> = listOf("Arcana", "History", "Investigation", "Medicine", "Nature", "Perception", "Sleight of Hand")
	override val armor: List<String> = listOf("Light armor", "Medium armor", "Shields")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Hand crossbows", "Heavy crossbows")
	override val toolProficiencies: List<String> = listOf("Thieves' tools", "Tinker's tools", "One type of artisan's tools of your choice")
	override val savingThrowProficiencies: List<String> = listOf("Constitution", "Intelligence")
	override val skillProficiencies: List<String> = listOf("Choose two from Arcana, History, Investigation, Medicine, Nature, and Perception")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a handaxe and a light hammer or (b) any two simple weapons\n" +
			"(a) a light crossbow and 20 bolts or (b) any two hand crossbows\n" +
			"(a) a scholar's pack or (b) a dungeoneer's pack\n" +
			"Leather armor and a dagger"
	override val startingGold: String = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Magical Tinkering" to "At 1st level, you learn how to invest a spark of magic in objects that would otherwise be mundane. To use this ability, you must have thieves' tools or artisan's tools in hand.",
		"Spellcasting" to "You have studied the workings of magic, how to channel it through objects, and how to awaken it within them. As a result, you have gained a limited ability to cast spells."
	)
}