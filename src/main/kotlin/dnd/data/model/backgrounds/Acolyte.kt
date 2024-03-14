package dnd.data.model.backgrounds

class Acolyte : Background() {
	override val name: String = "Acolyte"
	override val skillProficiencies: List<String> = listOf("Insight", "Religion")
	override val languages: List<String> = listOf("Two of your choice")
	override val equipment: List<String> = listOf("A holy symbol", "A prayer book or prayer wheel", "5 sticks of incense", "Vestments", "A set of common clothes", "A belt pouch containing 15 gp")
	override val feature: String = "Shelter of the Faithful"
	override val personalityTraits: List<String> = listOf("I idolize a particular hero of my faith, and constantly refer to that person's deeds and example.")
	override val ideals: List<String> = listOf("Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld.")
	override val bonds: List<String> = listOf("I owe my life to the priest who took me in when my parents died.")
	override val flaws: List<String> = listOf("I am inflexible in my thinking.")
}