package dnd.data.model.backgrounds

class Charlatan : Background() {
	override val name: String = "Charlatan"
	override val skillProficiencies: List<String> = listOf("Deception", "Sleight of Hand")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A set of fine clothes", "A disguise kit", "Tools of the con of your choice")
	override val feature: String = "False Identity"
	override val personalityTraits: List<String> = listOf("I lie about almost everything, even when there’s no good reason to.")
	override val ideals: List<String> = listOf("Independence. I am a free spirit—no one tells me what to do.")
	override val bonds: List<String> = listOf("I owe everything to my mentor—a horrible person who’s probably rotting in jail somewhere.")
	override val flaws: List<String> = listOf("I can’t resist a pretty face.")
}