package com.nerds

class Photo {
    byte[] photo
    String description

    Date dateCreated //gets autoFilled by Grails
    Date lastUpdated

    static belongsTo = [post: Post]


    static constraints = {
        photo maxSize: 5 * 1024 * 1024 //5MB
        description maxSize: 250
        post nullable: true
    }
}
