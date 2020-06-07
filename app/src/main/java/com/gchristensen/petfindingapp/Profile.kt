package com.gchristensen.petfindingapp

/**
 * A Profile Class containing user's location, pets, and radius preference.
 * it needs to output a notification level of 1 if the message is in range, and 0 if not.
 * */
class Profile {
    val pets: ArrayList<Pet> = TODO()
    var radius: Int = TODO()
    var location: Location = TODO() // Need to attach to Gage's Location class

    /**
     * Returns the notification level and notification that the user should get for this message.
     * 0 for none, 1 for the lowest notification, and so on.
     * */
    data class Notification(val level: Int, val content: String)
    fun notificationLevel(message: Message): Notification {
        if (messageInRange(message)) { // if the message is in range
            if (messageHighlyRelevant(message)) {
                return Notification(3, "A dog has gone missing close to your location!") // High relevance
            } else if (messageRelevant(message)) {
                return Notification(2, "A dog has gone missing in your area") // Medium relevance
            } else {
                return Notification(1, "A dog is missing in your area") // Low relevance
            }
        } else {
            return Notification(0, "") // No notification if not in range
        }
    }

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

