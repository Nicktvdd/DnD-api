package dnd.data.model.backgrounds

class FolkHero : Background() {
	override val name: String = "Folk Hero"
	override val skillProficiencies: List<String> = listOf("Animal Handling", "Survival")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A set of artisan’s tools", "A shovel", "An iron pot", "A set of common clothes", "A belt pouch containing 10 gp")
	override val feature: String = "Rustic Hospitality"
	override val personalityTraits: List<String> = listOf("I judge people by their actions, not their words.")
	override val ideals: List<String> = listOf("Respect. People deserve to be treated with dignity and respect.")
	override val bonds: List<String> = listOf("I have a family, but I have no idea where they are. One day, I hope to see them again.")
	override val flaws: List<String> = listOf("I have a weakness for the vices of the city, especially hard drink.")
}