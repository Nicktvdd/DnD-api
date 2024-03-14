package dnd.data.model.backgrounds

class Entertainer : Background() {
	override val name: String = "Entertainer"
	override val skillProficiencies: List<String> = listOf("Acrobatics", "Performance")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A musical instrument", "The favor of an admirer", "A costume")
	override val feature: String = "By Popular Demand"
	override val personalityTraits: List<String> = listOf("I know a story relevant to almost every situation.")
	override val ideals: List<String> = listOf("Creativity. The world is in need of new ideas and bold action.")
	override val bonds: List<String> = listOf("My instrument is my most treasured possession, and it reminds me of someone I love.")
	override val flaws: List<String> = listOf("I’ll do anything to win fame and renown.")
}