package dnd.services.characterServices

import dnd.data.Names


class RandomNameGenerator {
	private val names = Names()

	fun generateRandomName(race: String): String {
		return when (race.lowercase()) {
			"elf" -> generateName(names.elfPrefixes, names.elfSuffixes)
			"dwarf" -> generateName(names.dwarfPrefixes, names.dwarfSuffixes)
			"human" -> generateName(names.humanPrefixes, names.humanSuffixes)
			"half-orc" -> generateName(names.orcPrefixes, names.orcSuffixes)
			"halfling" -> generateName(names.halflingPrefixes, names.halflingSuffixes)
			"dragonborn" -> generateName(names.dragonbornPrefixes, names.dragonbornSuffixes)
			"gnome" -> generateName(names.gnomePrefixes, names.gnomeSuffixes)
			"tiefling" -> generateName(names.tieflingPrefixes, names.tieflingSuffixes)
			"half-elf" -> generateName(names.halfElfPrefixes, names.halfElfSuffixes)
			else -> "Unknown race"
		}
	}

	private fun generateName(prefixes: List<String>, suffixes: List<String>): String {
		val prefix = prefixes.random()
		val suffix = suffixes.random()
		return "$prefix$suffix"
	}
}