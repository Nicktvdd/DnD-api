package dnd.data.model.races

abstract class Race {
	abstract val abilityScoreIncreases: Map<String, Int>
	abstract val size: String
	abstract val speed: String
	abstract val age: String
	abstract val languages: String
}