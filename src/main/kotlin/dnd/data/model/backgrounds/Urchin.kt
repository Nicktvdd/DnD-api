package dnd.data.model.backgrounds

class Urchin : Background() {
	override val name: String = "Urchin"
	override val skillProficiencies: List<String> = listOf("Sleight of Hand", "Stealth")
	override val languages: List<String> = listOf()
	override val equipment: List<String> = listOf("A small knife", "A map of the city you grew up in", "A pet mouse", "A token to remember your parents by", "A set of common clothes", "A belt pouch containing 10 gp")
	override val feature: String = "City Secrets"
	override val personalityTraits: List<String> = listOf("I hide scraps of food and trinkets away in my pockets.")
	override val ideals: List<String> = listOf("Respect. All people, rich or poor, deserve respect.")
	override val bonds: List<String> = listOf("I owe my survival to another urchin who taught me to live on the streets.")
	override val flaws: List<String> = listOf("I will never fully trust anyone other than myself.")
}