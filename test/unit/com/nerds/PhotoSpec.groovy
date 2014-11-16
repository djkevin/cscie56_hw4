package com.nerds

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Photo)
class PhotoSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test create a photo without post"() {
        when: "we create a new Photo without a post"
        def img = [0, 0, 0, 0, 0] as byte[]
        def photo = new Photo(description: "sample photo 1", photo: img).save()

        then: 'it should validate OK'
        photo.validate()
    }
}
