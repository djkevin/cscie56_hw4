package com.nerds

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test create a Post without photos"() {
        when: "we create a new Post"
        def post = new Post(body: "sample post", posted: new Date(), mood: Mood.HAPPY).save()

        then: 'it should validate OK'
        post.validate()
    }

    void "test create a Post with 2 photos"() {
        when: "we create a new Post with 2 photos"
        def img = [0, 0, 0, 0, 0] as byte[]
        def photo1 = new Photo(description: "sample photo 1", photo: img)
        def photo2 = new Photo(description: "sample photo 2", photo: img)
        def post = new Post(body: "sample post", posted: new Date(), mood: Mood.HAPPY, photos: [photo1, photo2]).save()

        then: 'it should validate OK'
        post.validate()
    }

    void "test create a Post with more than 5 photos"() {
        when: "we create a new Post and add more than 5 photos"
        def photos = []
        def img = [0, 0, 0, 0, 0] as byte[]
        for (i in 0..5) {
            photos << new Photo(description: "sample photo", photo: img)
        }
        def post = new Post(body: "sample post", posted: new Date(), mood: Mood.HAPPY)
        post.photos = photos
        post.save()



        then: 'it should fail validation'
        !post.validate()
//        post.errors.getFieldError("photos").defaultMessage =="max"
        photos.size() == 6
//        println post.errors.getFieldError("photos")
    }
}
