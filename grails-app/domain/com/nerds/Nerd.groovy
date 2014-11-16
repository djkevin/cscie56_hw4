package com.nerds

class Nerd {

    String firstName
    String lastName
    String initials
    Date birthDate
    Boolean acceptedTerms

    static mapWith = "mongo" //if we use mongo and hibernate together

    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable: false, blank:false
        initials nullable:true, blank:true
        birthDate()// max: new Date()
        acceptedTerms()

    }
}
