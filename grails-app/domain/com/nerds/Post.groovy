package com.nerds

class Post {
    String body
    Date posted = new Date()
    Mood mood


    static hasMany = [likes: Like, dislikes: Dislike, photos: Photo]
    static constraints = {
        body maxSize: 2000
        posted max: new Date()
        photos validator: { val, obj ->
            def retval = true
            if (val?.size() > 5) {
                retval = 'max.photos.error'
            }
            retval
        }
    }
}
