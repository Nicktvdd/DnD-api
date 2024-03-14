package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Bard: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Charisma"
	override val saves: List<String> = listOf("Dexterity", "Charisma")
	override val skills: List<String> = listOf("Choose any three")
	override val armor: List<String> = listOf("Light armor")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Hand crossbows", "Longswords", "Rapiers", "Shortswords")
	override val toolProficiencies: List<String> = listOf("Three musical instruments of your choice")
	override val savingThrowProficiencies: List<String> = listOf("Dexterity", "Charisma")
	override val skillProficiencies: List<String> = listOf("Choose any three")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a rapier, (b) a longsword, or (c) any simple weapon\n" +
			"(a) a diplomat's pack or (b) an entertainer's pack\n" +
			"(a) a lute or (b) any other musical instrument\n" +
			"Leather armor and a dagger"
	override val startingGold: String = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Spellcasting" to "You have learned to untangle and reshape the fabric of reality in harmony with your wishes and music. Your spells are part of your vast repertoire, magic that you can tune to different situations.",
		"Bardic Inspiration" to "You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6."
	)
}