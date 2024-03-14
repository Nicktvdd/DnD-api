package dnd.data.model.classes

abstract class Class {
	abstract val hitDie: Int
	abstract val primaryAbility: String
	abstract val saves: List<String>
	abstract val skills: List<String>
	abstract val armor: List<String>
	abstract val weaponProficiencies: List<String>
	abstract val toolProficiencies: List<String>
	abstract val savingThrowProficiencies: List<String>
	abstract val skillProficiencies: List<String>
	abstract val startingEquipment: String
	abstract val startingGold: String
	abstract val classFeatures: Map<String, String>
}