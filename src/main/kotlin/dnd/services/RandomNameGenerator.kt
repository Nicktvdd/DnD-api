package dnd.services

class RandomNameGenerator {
	private val elfPrefixes = listOf("Thra", "Glo", "Zan", "Xal", "Ari", "Eld", "Syl", "Var", "Cyn", "Vor")
	private val elfSuffixes = listOf("dor", "gorn", "thor", "mire", "ryn", "vex", "dras", "thys", "lorn", "quen")

	private val dwarfPrefixes = listOf("Bor", "Dor", "Gim", "Kil", "Thor", "Bal", "Gloin", "Durin", "Thrain", "Balin")
	private val dwarfSuffixes = listOf("in", "or", "ar", "ur", "rin", "lin", "li", "din", "min", "dor")

	private val humanPrefixes = listOf("Al", "Bel", "Cor", "El", "Gan", "Ith", "Kas", "Lor", "Mar", "Oth")
	private val humanSuffixes = listOf("an", "ian", "ius", "or", "us", "ius", "on", "ar", "ra", "in")

	private val orcPrefixes = listOf("Gruk", "Raz", "Dor", "Gol", "Throk", "Urz", "Krom", "Grish", "Mog", "Zog")
	private val orcSuffixes = listOf("mash", "nak", "gul", "tar", "dush", "thar", "kaz", "kash", "rog", "rak")

	private val halflingPrefixes = listOf("Wil", "Hob", "Per", "Brin", "Sam", "Meri", "Fro", "Ros", "Ber", "Pip")
	private val halflingSuffixes = listOf("buck", "toe", "leaf", "hand", "weed", "foot", "hill", "bottom", "wood", "top")

	private val dragonbornPrefixes = listOf("Azi", "Bah", "Daar", "Kra", "Ri", "Tor", "Ver", "Zha", "Vor", "Uth")
	private val dragonbornSuffixes = listOf("gus", "thon", "doth", "rak", "naar", "mash", "gon", "drax", "syr", "thrax")

	private val tieflingPrefixes = listOf("Asmo", "Thav", "Meph", "Char", "Zari", "Bel", "Fero", "Gall", "Kyr", "Lev")
	private val tieflingSuffixes = listOf("on", "is", "or", "ius", "in", "an", "ar", "ax", "us", "ix")

	private val gnomePrefixes = listOf("Nim", "Giz", "Bix", "Zib", "Fizz", "Sprock", "Tock", "Cog", "Snip", "Jinx")
	private val gnomeSuffixes = listOf("ble", "blet", "bolt", "nack", "nick", "noodle", "fizzle", "whizzle", "widget", "bop")

	private val halfElfPrefixes = listOf("El", "Lor", "Mar", "Gal", "Syl", "Thal", "Riv", "Shan", "Ky", "Dil")
	private val halfElfSuffixes = listOf("orin", "ian", "ius", "el", "il", "ion", "an", "en", "ion", "en")

	fun generateRandomName(race: String): String {
		return when (race.lowercase()) {
			"elf" -> generateName(elfPrefixes, elfSuffixes)
			"dwarf" -> generateName(dwarfPrefixes, dwarfSuffixes)
			"human" -> generateName(humanPrefixes, humanSuffixes)
			"half-orc" -> generateName(orcPrefixes, orcSuffixes)
			"halfling" -> generateName(halflingPrefixes, halflingSuffixes)
			"dragonborn" -> generateName(dragonbornPrefixes, dragonbornSuffixes)
			"gnome" -> generateName(gnomePrefixes, gnomeSuffixes)
			"tiefling" -> generateName(tieflingPrefixes, tieflingSuffixes)
			"half-elf" -> generateName(halfElfPrefixes, halfElfSuffixes)
			else -> "Unknown race"
		}
	}

	private fun generateName(prefixes: List<String>, suffixes: List<String>): String {
		val prefix = prefixes.random()
		val suffix = suffixes.random()
		return "$prefix$suffix"
	}
}