package com.nerds

class Photo {
    byte[] photo
    String description

    Date dateCreated
    Date lastUpdated

    static belongsTo = [post:Post]


    static constraints = {
    }
}
