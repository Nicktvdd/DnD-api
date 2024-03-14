package dnd.data.model.races

class Dwarf: Race() {
	val subRace = "Hill Dwarf"
	override val abilityScoreIncreases = mapOf(
		"Constitution" to 2,
		"Wisdom" to 1,
	)
	override val size = "Medium"
	override val speed = "25 feet"
	override val age = "Dwarves mature at the same rate as humans, but they're considered young until they reach the age of 50. On average, they live about 350 years."
	val sizeDescription = "Dwarves stand between 4 and 5 feet tall and average about 150 pounds. Your size is Medium."
	override val languages = "You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak"
	val speedInHeavyArmor = "Your speed is not reduced by wearing heavy armor"
	val darkvision = "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."
	val dwarvenResilience = "You have advantage on saving throws against poison, and you have resistance against poison damage"
	val stonecunning = "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus"
	val dwarvenCombatTraining = "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer"
	val toolProficiency = "You gain proficiency with the artisan's tools of your choice: smith's tools, brewer's supplies, or mason's tools"
	val dwarvenToughness = "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level"
	val subRaceDescription = "As a hill dwarf, you have keen senses, deep intuition, and remarkable resilience"
}