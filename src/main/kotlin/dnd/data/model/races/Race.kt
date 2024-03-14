package dnd.data.model.races

open class Race {
	open val abilityScoreIncreases: Map<String, Int> = mapOf()
	open val size: String = ""
	open val speed: String = ""
	open val age: String = ""
	open val languages: String = ""
}