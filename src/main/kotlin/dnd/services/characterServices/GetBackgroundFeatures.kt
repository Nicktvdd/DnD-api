package dnd.services.characterServices

import dnd.data.model.backgrounds.*
import kotlin.reflect.full.memberProperties

fun getBackgroundFeatures(background: String): Map<String, String?> {
	val backgroundInstance = when (background) {
		"Hermit" -> Hermit()
		"Soldier" -> Soldier()
		"Charlatan" -> Charlatan()
		"Entertainer" -> Entertainer()
		"Guild Artisan" -> GuildArtisan()
		"Outlander" -> Outlander()
		"Noble" -> Noble()
		"Sailor" -> Sailor()
		"Folk Hero" -> FolkHero()
		"Acolyte" -> Acolyte()
		"Urchin" -> Urchin()
		"Criminal" -> Criminal()
		"Sage" -> Sage()
		// Add other backgrounds here...
		else -> null
	}

	return when (backgroundInstance) {
		is Hermit -> {
			Hermit::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Soldier -> {
			Soldier::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Charlatan -> {
			Charlatan::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Entertainer -> {
			Entertainer::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is GuildArtisan -> {
			GuildArtisan::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Outlander -> {
			Outlander::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Noble -> {
			Noble::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Sailor -> {
			Sailor::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is FolkHero -> {
			FolkHero::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Acolyte -> {
			Acolyte::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Urchin -> {
			Urchin::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Criminal -> {
			Criminal::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		is Sage -> {
			Sage::class.memberProperties.associateBy({ it.name }, { it.get(backgroundInstance)?.toString() })
		}
		// Add other backgrounds here...
		else -> mapOf("Error" to "Background not found")
	}
}