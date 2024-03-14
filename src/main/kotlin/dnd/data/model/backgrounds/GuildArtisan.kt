package dnd.data.model.backgrounds

class GuildArtisan : Background() {
	override val name: String = "Guild Artisan"
	override val skillProficiencies: List<String> = listOf("Insight", "Persuasion")
	override val languages: List<String> = listOf("One of your choice")
	override val equipment: List<String> = listOf("A set of artisan’s tools", "A letter of introduction from your guild", "A set of traveler’s clothes", "A belt pouch containing 15 gp")
	override val feature: String = "Guild Membership"
	override val personalityTraits: List<String> = listOf("I believe that anything worth doing is worth doing right.")
	override val ideals: List<String> = listOf("Community. It is the duty of all civilized people to strengthen the bonds of community and the security of civilization.")
	override val bonds: List<String> = listOf("I owe my guild a great debt for forging me into the person I am today.")
	override val flaws: List<String> = listOf("I’m never satisfied with what I have—I always want more.")
}