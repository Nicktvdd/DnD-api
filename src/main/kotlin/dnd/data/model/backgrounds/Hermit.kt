package dnd.data.model.backgrounds

class Hermit : Background() {
	override val name: String = "Hermit"
	override val skillProficiencies: List<String> = listOf("Medicine", "Religion")
	override val languages: List<String> = listOf("One of your choice")
	override val equipment: List<String> = listOf("A scroll case stuffed full of notes from your studies or prayers", "A winter blanket", "A set of common clothes", "An herbalism kit")
	override val feature: String = "Discovery"
	override val personalityTraits: List<String> = listOf("I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.")
	override val ideals: List<String> = listOf("Greater Good. My gifts are meant to be shared with all, not used for my own benefit.")
	override val bonds: List<String> = listOf("Should my discovery come to light, it could bring ruin to the world.")
	override val flaws: List<String> = listOf("I’d risk too much to uncover a lost bit of knowledge.")
}