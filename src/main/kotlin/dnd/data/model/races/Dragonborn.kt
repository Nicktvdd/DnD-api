package dnd.data.model.races

class Dragonborn : Race() {
	override val abilityScoreIncreases = mapOf(
		"Strength" to 2,
		"Charisma" to 1
	)
	override val size =
		"Medium"
	val sizeDescription =
		"Dragonborn are taller and heavier than humans, standing well over 6 feet tall and averaging almost 250 pounds. Your size is Medium."
	override val speed =
		"30 feet"
	override val age =
		"Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80."
	override val languages =
		"You can speak, read, and write Common and Draconic. Draconic is thought to be one of the oldest languages and is often used in the study of magic. The language sounds harsh to most other creatures and includes numerous hard consonants and sibilants."
	val draconicAncestry =
		"You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table."
	val table = mapOf(
		"Black" to "Acid - 5 by 30 ft. line (Dex. save) - Acid",
		"Blue" to "Lightning - 5 by 30 ft. line (Dex. save) - Lightning",
		"Brass" to "Fire - 5 by 30 ft. line (Dex. save) - Fire",
		"Bronze" to "Lightning - 5 by 30 ft. line (Dex. save) - Lightning",
		"Copper" to "Acid - 5 by 30 ft. line (Dex. save) - Acid",
		"Gold" to "Fire - 15 ft. cone (Dex. save) - Fire",
		"Green" to "Poison - 15 ft. cone (Con. save) - Poison",
		"Red" to "Fire - 15 ft. cone (Dex. save) - Fire",
		"Silver" to "Cold - 15 ft. cone (Con. save) - Cold",
		"White" to "Cold - 15 ft. cone (Con. save) - Cold"
	)
	val breathWeapon =
		"You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level."
	val damageResistance =
		"You have resistance to the damage type associated with your draconic ancestry."
}