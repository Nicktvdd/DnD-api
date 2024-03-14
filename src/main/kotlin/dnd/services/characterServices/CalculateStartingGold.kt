package dnd.services.characterServices

import kotlin.random.Random

fun calculateStartingGold( amountOfDice: Int, dice: Int, multiplier: Int): Int {
	return (1..amountOfDice).map { Random.Default.nextInt(1, dice) }.sum() * multiplier
}