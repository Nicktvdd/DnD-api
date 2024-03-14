package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Monk: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Dexterity"
	override val saves: List<String> = listOf("Strength", "Dexterity")
	override val skills: List<String> = listOf("Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth")
	override val armor: List<String> = listOf("None")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Shortswords")
	override val toolProficiencies: List<String> = listOf("Choose one type of artisan's tools or one musical instrument")
	override val savingThrowProficiencies: List<String> = listOf("Strength", "Dexterity")
	override val skillProficiencies: List<String> = listOf("Choose two from Acrobatics, Athletics, History, Insight, Religion, and Stealth")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a shortsword or (b) any simple weapon\n" +
			"(a) a dungeoneer's pack or (b) an explorer's pack\n" +
			"10 darts"
	override val startingGold: String = calculateStartingGold(1, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Unarmored Defense" to "Beginning at 1st level, while you are wearing no armor and not wielding a shield, your AC equals 10 + your Dexterity modifier + your Wisdom modifier.",
		"Martial Arts" to "At 1st level, your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don't have the two-handed or heavy property."
	)
}