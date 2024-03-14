package dnd.data.model.backgrounds

class Criminal : Background() {
	override val name: String = "Criminal"
	override val skillProficiencies: List<String> = listOf("Deception", "Stealth")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A crowbar", "A set of dark common clothes including a hood")
	override val feature: String = "Criminal Contact"
	override val personalityTraits: List<String> = listOf("I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.")
	override val ideals: List<String> = listOf("Honor. I don’t steal from others in the trade.")
	override val bonds: List<String> = listOf("I’m trying to pay off an old debt I owe to a generous benefactor.")
	override val flaws: List<String> = listOf("When I see something valuable, I can’t think about anything but how to steal it.")
}