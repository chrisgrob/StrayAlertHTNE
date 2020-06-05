package com.gchristensen.petfindingapp

/**
 * A Profile Class containing user's location, pets, and radius preference.
 *
 * */
class Profile {
    /**
     * Takes a message and checks if that message is within range of user.
     * */
    fun messageInRange(message: Message): Boolean {
        TODO()
    }

    /**
     * Checks if the message is moderately relevant to the user (matching breed, pet type).
     * */
    fun messageRelevant(message: Message): Boolean {
        TODO()
    }

    /**
     * Checks if the message is highly relevant to the user (matching name, matching owner, etc.)
     * */
    fun messageHighlyRelevant(message: Message) : Boolean {
        TODO()
    }
}

