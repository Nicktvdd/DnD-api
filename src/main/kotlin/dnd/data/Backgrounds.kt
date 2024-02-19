package dnd.data

object Backgrounds {
		private val backgrounds = listOf(
			"Acolyte",
			"Charlatan",
			"Criminal",
			"Entertainer",
			"Folk Hero",
			"Guild Artisan",
			"Hermit",
			"Noble",
			"Outlander",
			"Sage",
			"Sailor",
			"Soldier",
			"Urchin"
		)

		fun random(): String {
			return backgrounds.random()
		}
	}
