package dnd.data.model.backgrounds


abstract class Background {
	abstract val name: String
	abstract val skillProficiencies: List<String>
	abstract val languages: List<String>
	abstract val equipment: List<String>
	abstract val feature: String
	abstract val personalityTraits: List<String>
	abstract val ideals: List<String>
	abstract val bonds: List<String>
	abstract val flaws: List<String>
}