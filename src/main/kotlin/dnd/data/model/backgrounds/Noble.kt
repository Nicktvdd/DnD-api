package dnd.data.model.backgrounds

class Noble : Background() {
	override val name: String = "Noble"
	override val skillProficiencies: List<String> = listOf("History", "Persuasion")
	override val languages: List<String> = listOf("One of your choice")
	override val equipment: List<String> = listOf("A set of fine clothes", "A signet ring", "A scroll of pedigree", "A purse containing 25 gp")
	override val feature: String = "Position of Privilege"
	override val personalityTraits: List<String> = listOf("My eloquent flattery makes everyone I talk to feel like the most wonderful and important person in the world.")
	override val ideals: List<String> = listOf("Respect is due to me because of my position, but all people regardless of station deserve to be treated with dignity.")
	override val bonds: List<String> = listOf("I will face any challenge to win the approval of my family.")
	override val flaws: List<String> = listOf("I hide a truly scandalous secret that could ruin my family forever.")
}