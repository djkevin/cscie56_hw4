package com.nerds

import grails.transaction.Transactional

@Transactional
class NerdService {

    /**
     * saves to the db. used for both create and update
     * @param nerd
     */
    void save(Nerd nerd) {
        nerd.save() // No need to set flush:true - the transaction does it
    }


    void delete(Nerd nerd) {
        nerd.delete()
    }

    void delete(long nerdId) {
        def nerd = Nerd.load(nerdId)// only gets a proxy wrapping the id. Use over get(id)
        nerd.delete()
    }
}
