package dnd.data.model.classes

import dnd.services.characterServices.calculateStartingGold

class Fighter: Class() {
	override val hitDie = 10
	override val primaryAbility = "Strength or Dexterity"
	override val skills = listOf("Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival")
	override val armor = listOf("Light armor", "Medium armor", "Heavy armor", "Shields")
	override val weaponProficiencies = listOf("Simple weapons", "Martial weapons")
	override val toolProficiencies = listOf("None")
	override val savingThrowProficiencies = listOf("Strength", "Constitution")
	override val skillProficiencies = listOf("Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival")
	override val startingEquipment = "You start with the following equipment, in addition to the equipment granted by your background:\n" +
		"(a) chain mail or (b) leather armor, longbow, and 20 arrows\n" +
		"(a) a martial weapon and a shield or (b) two martial weapons\n" +
		"(a) a light crossbow and 20 bolts or (b) two handaxes\n" +
		"(a) a dungeoneer's pack or (b) an explorer's pack"
	override val startingGold = calculateStartingGold(5, 4, 10).toString()
	override val classFeatures = mapOf(
		"Second Wind" to "You have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or long rest before you can use it again.",
		"Fighting Style" to "You adopt a particular style of fighting as your specialty. Choose one of the following options. You can't take a Fighting Style option more than once, even if you later get to choose again.\n" +
			"Archery: You gain a +2 bonus to attack rolls you make with ranged weapons.\n" +
			"Defense: While you are wearing armor, you gain a +1 bonus to AC.\n" +
			"Dueling: When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon.\n" +
			"Great Weapon Fighting: When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.\n" +
			"Protection: When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.\n" +
			"Two-Weapon Fighting: When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack."
	)
}