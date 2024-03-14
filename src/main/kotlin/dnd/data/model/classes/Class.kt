package dnd.data.model.classes

open class Class {
	open val hitDie: Int = 0
	open val primaryAbility: String = ""
	open val saves: List<String> = listOf()
	open val skills: List<String> = listOf()
	open val armor: List<String> = listOf()
	open val weaponProficiencies: List<String> = listOf()
	open val toolProficiencies: List<String> = listOf()
	open val savingThrowProficiencies: List<String> = listOf()
	open val skillProficiencies: List<String> = listOf()
	open val startingEquipment: String = ""
	open val startingGold: String = ""
	open val classFeatures: Map<String, String> = mapOf()
}