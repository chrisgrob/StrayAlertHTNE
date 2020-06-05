package com.gchristensen.petfindingapp

/**
 * A Profile Class containing user's location, pets, and radius preference.
 *
 * */
class Profile {
    val pets: ArrayList<Pet> = TODO()
    var radius: Int = TODO()
    var location: Location = TODO()

    /**
     * Returns the notification level and notification that the user should get for this message.
     * 0 for none, 1 for the lowest notification, and so on.
     * */
    data class Notification(val level: Int, val content: String)
    fun notificationLevel(message: Message): Notification {
        TODO()
        // Example for loop
//        for (pet in pets) {
//            // do stuff
//        }

//        This is how you return a data class
//        return Notifcation(0, "hi my name is bob")
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

