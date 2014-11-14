package com.nerds

class Nerd {

    String firstName
    String lastName
    String initials
    Date birthDate
    Boolean acceptedTerms

    static constraints = {
        initials nullable:true, blank:true
    }
}
