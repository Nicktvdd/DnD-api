package dnd.data.model.traits

object Alignments {
	private val alignments = listOf("Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil")


	fun random(): String {
		return alignments.random()
	}
}