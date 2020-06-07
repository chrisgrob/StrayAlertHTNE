package com.gchristensen.petfindingapp

import android.location.Location as AndroidLocation

/**
 * Wrapper around GPS Location to provide convenient services
 * */
class Location(private val androidLocation: AndroidLocation) {
    /**
     * Gives the distance from another location.
     * */
    fun distanceTo(other: Location): Int {
        return androidLocation.distanceTo(other.androidLocation).toInt()
    }
}