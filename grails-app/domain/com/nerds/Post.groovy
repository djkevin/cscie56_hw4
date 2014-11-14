package com.nerds

class Post {
    String body
    Date posted = new Date()
    Mood mood


    static hasMany = [likes: Like, dislikes: Dislike, photos:Photo]
    static constraints = {
        body maxSize: 2000
    }
}
