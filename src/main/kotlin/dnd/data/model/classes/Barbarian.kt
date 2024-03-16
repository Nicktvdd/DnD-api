package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Barbarian: Class() {
	override val hitDie: Int = 12
	override val primaryAbility: String = "Strength"
	override val skills: List<String> = listOf("Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival")
	override val armor: List<String> = listOf("Light armor", "Medium armor", "Shields")
	override val weaponProficiencies: List<String> = listOf("Simple weapons", "Martial weapons")
	override val toolProficiencies: List<String> = listOf("None")
	override val savingThrowProficiencies: List<String> = listOf("Strength", "Constitution")
	override val skillProficiencies: List<String> = listOf("Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival")
	override val startingEquipment: String = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
		"(a) a greataxe or (b) any martial melee weapon\n" +
		"(a) two handaxes or (b) any simple weapon\n" +
		"An explorer's pack and four javelins"
	override val startingGold: String = calculateStartingGold(2, 4, 10).toString()
	override val classFeatures: Map<String, String> = mapOf(
		"Rage" to "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren't wearing heavy armor:\n" +
			"You have advantage on Strength checks and Strength saving throws.\n" +
			"When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
			"You have resistance to bludgeoning, piercing, and slashing damage.",
		"Unarmored Defense" to "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit."
	)
}