package com.nerds

class Like {

    Date dateCreated

    static belongsTo = [post:Post]

    static constraints = {
    }
}
