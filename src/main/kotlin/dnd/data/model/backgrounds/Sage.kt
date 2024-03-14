package dnd.data.model.backgrounds

class Sage : Background() {
	override val name: String = "Sage"
	override val skillProficiencies: List<String> = listOf("Arcana", "History")
	override val languages: List<String> = listOf("Two of your choice")
	override val equipment: List<String> = listOf("A bottle of black ink", "A quill", "A small knife", "A letter from a dead colleague posing a question you have not yet been able to answer", "A set of common clothes", "A belt pouch containing 10 gp")
	override val feature: String = "Researcher"
	override val personalityTraits: List<String> = listOf("I use polysyllabic words that convey the impression of great erudition.")
	override val ideals: List<String> = listOf("Knowledge. The path to power and self-improvement is through knowledge.")
	override val bonds: List<String> = listOf("It is my duty to protect my students.")
	override val flaws: List<String> = listOf("I overlook obvious solutions in favor of complicated ones.")
}