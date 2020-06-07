# Pet Finding App

Authors: Bruce Choe, Gage Christensen, and Dylan Wong(currently not showing up as a contributor, 
even though he made commits, see his github: https://github.com/Wong-Innovations).

## The Problem

Currently, if you encounter a stray pet on the street, you have to get close enough to see its tag
in order to get in contact with the owner. In the case of dogs, this can sometimes be difficult, as
the dog may be aggressive or they may run away when approached. In other cases, a person may
retrieve the collar info but the owner may be unresponsive, and the person may not have much time
to stick around. Or, in the worst case, the animal in question may not even have a collar, so the
owner is impossible to find.

## The Solution

We decided to solve this problem by creating an app that would allow stray finders to send out
alerts about spotted animals and allow pet owners to receive alerts that may be relevant to them. 
This allows owners to have the chance to get notified about a lost pet even if the finder could not
get close enough to retrieve their info, and also enables higher response rates through dedicated
notifications. Key functionalities required for this app include:

* Ability for a user to take a picture of a stray, and then send out an alert with a message and the
user's location. All user's within a valid range would receive the alert.
* Ability for a user to register their pet with the app. Then, if an alert contained information
such as dog breed, the app would check that information with the user's profile to see if the alert
is more relevant to them. In addition, if the alert contained info such as phone numbers or
addresses from the collar, a high level notification that confirms that the owner's pet is found
would be sent. This increases the likelihood that a finder will be able to get in contact with the
owner.
