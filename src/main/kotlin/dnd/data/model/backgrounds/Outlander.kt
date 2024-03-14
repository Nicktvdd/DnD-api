package dnd.data.model.backgrounds

class Outlander : Background() {
	override val name: String = "Outlander"
	override val skillProficiencies: List<String> = listOf("Athletics", "Survival")
	override val languages: List<String> = listOf("One of your choice")
	override val equipment: List<String> = listOf("A staff", "A hunting trap", "A trophy from an animal you killed", "A set of traveler’s clothes", "A belt pouch containing 10 gp")
	override val feature: String = "Wanderer"
	override val personalityTraits: List<String> = listOf("I’m driven by a wanderlust that led me away from home.")
	override val ideals: List<String> = listOf("Change. Life is like the seasons, in constant change, and we must change with it.")
	override val bonds: List<String> = listOf("My family, clan, or tribe is the most important thing in my life, even when they are far from me.")
	override val flaws: List<String> = listOf("I am too enamored of ale, wine, and other intoxicants.")
}