package dnd.data.model.backgrounds

class Soldier : Background() {
	override val name: String = "Soldier"
	override val skillProficiencies: List<String> = listOf("Athletics", "Intimidation")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("An insignia of rank", "A trophy taken from a fallen enemy", "A set of bone dice or deck of cards", "A set of common clothes", "A belt pouch containing 10 gp")
	override val feature: String = "Military Rank"
	override val personalityTraits: List<String> = listOf("I can stare down a hell hound without flinching.")
	override val ideals: List<String> = listOf("Greater Good. Our lot is to lay down our lives in defense of others.")
	override val bonds: List<String> = listOf("I would still lay down my life for the people I served with.")
	override val flaws: List<String> = listOf("I have little respect for anyone who is not a proven warrior.")
}