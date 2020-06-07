package com.gchristensen.petfindingapp

import android.app.PendingIntent
import android.content.Intent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Handles the receiving of alerts
 * */
class AlertService: FirebaseMessagingService() {
    /**
     * Called every time a message is received. How relevant the message is has been determined
     * by the server.
     *
     * @param remoteMessage Object representing the message received from FCM.
     * */
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Log the sender of the message.
        Log.d(MSG_TAG, "From: " + remoteMessage.from)

        // Get a user friendly notification body.
        val userNotification = generateUserNotification(remoteMessage)

        // Send notification to device.
        sendNotification(userNotification)
    }

    /**
     * Called whenever the InstanceID token is updated, and also when it is initially generated.
     * This will send the token to the server so that it may update the user's info.
     *
     * @param token A String representing the new token.
     * */
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(TOKEN_TAG, "Refreshed token: $token")

        sendRegistrationToServer(token)
    }

    /**
     * Parses the remote message and generates a user friendly notification to display.
     *
     * @param remoteMessage The RemoteMessage received.
     * */
    private fun generateUserNotification(remoteMessage: RemoteMessage): String {
        // TODO("Need to determine structure of remote message data")

        return "Hi"
    }

    /**
     * Sends a user friendly notification to the user's device.
     *
     * @param message The body of the notification. Intended for the user's view.
     * */
    private fun sendNotification(message: String?) {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT)

        val channelID = get
    }

    /**
     * Sends the token to the server so that the user's profile will be updated and they can
     * still receive notifications.
     *
     * @param token The new token of the user.
     * */
    private fun sendRegistrationToServer(token: String) {
        // TODO("Need to research server-side")
    }

    companion object {
        private const val TOKEN_TAG = "FirebaseTOKEN"
        private const val MSG_TAG = "FirebaseMSG"
    }
}