package dnd.data.model.backgrounds

class Sailor : Background() {
	override val name: String = "Sailor"
	override val skillProficiencies: List<String> = listOf("Athletics", "Perception")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A belaying pin (club)", "50 feet of silk rope", "A lucky charm", "A set of common clothes", "A belt pouch containing 10 gp")
	override val feature: String = "Ship's Passage"
	override val personalityTraits: List<String> = listOf("I enjoy sailing into new ports and making new friends over a flagon of ale.")
	override val ideals: List<String> = listOf("Freedom. The sea is freedom—the freedom to go anywhere and do anything.")
	override val bonds: List<String> = listOf("I’m loyal to my captain first, everything else second.")
	override val flaws: List<String> = listOf("I can’t help but pocket loose coins and other trinkets I come across.")
}