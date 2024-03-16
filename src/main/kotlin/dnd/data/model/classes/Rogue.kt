package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Rogue: Class() {
	override val hitDie: Int = 8
	override val primaryAbility: String = "Dexterity"
	override val skills: List<String> = listOf("Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation", "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth")
	override val armor: List<String> = listOf("Light armor")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Hand crossbows", "Longswords", "Rapiers", "Shortswords")
	override val toolProficiencies: List<String> = listOf("Thieves' tools")
	override val savingThrowProficiencies: List<String> = listOf("Dexterity", "Intelligence")
	override val skillProficiencies: List<String> = listOf("Choose four from Acrobatics, Athletics, Deception, Insight, Intimidation, Investigation, Perception, Performance, Persuasion, Sleight of Hand, and Stealth")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
			"(a) a rapier or (b) a shortsword\n" +
			"(a) a shortbow and quiver of 20 arrows or (b) a shortsword\n" +
			"(a) a burglar's pack, (b) a dungeoneer's pack, or (c) an explorer's pack\n" +
			"Leather armor, two daggers, and thieves' tools"
	override val startingGold: String = calculateStartingGold(4, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Expertise" to "At 1st level, choose two of your skill proficiencies, or one of your skill proficiencies and your proficiency with thieves' tools. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies.",
		"Sneak Attack" to "Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.",
		"Thieves' Cant" to "During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages."
	)
}