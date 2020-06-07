package com.gchristensen.petfindingapp

/**
 * Class storing information about a user's pet.
 * */
class Pet {
    /*
     *  Attributes
    */
    private var petName: String = TODO()
    private var petBreed: String = TODO()
    private var petColor: String = TODO()
    private var collarColor: String = TODO()
    private var ownerName: String = TODO()

    /*
     *  Mutators
    */
    fun setPetName(newName: String) {
        petName = newName
    }

    fun setPetBreed(newBreed: String) {
        petBreed = newBreed
    }

    fun setPetColor(newColor: String) {
        petBreed = newColor
    }

    fun setCollarColor(newCollarColor: String) {
        petBreed = newCollarColor
    }

    fun setOwnerName(newOwnerName: String) {
        petBreed = newOwnerName
    }

    /*
     *  Accessors
    */
    fun getPetName(pet: Pet): String {
        return petName
    }

    fun getPetBreed(pet: Pet): String {
        return petBreed
    }

    fun getPetColor(pet: Pet): String {
        return petColor
    }

    fun getCollarColor(pet: Pet): String {
        return collarColor
    }

    fun getOwnerName(pet: Pet): String {
        return ownerName
    }
}