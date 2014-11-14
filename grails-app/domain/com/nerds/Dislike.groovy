package com.nerds

class Dislike {

    Date dateCreated

    static belongsTo = [post: Post]

    static constraints = {
    }
}
