package com.appus.extrasvazifalar.thirdtask.models

import java.io.Serializable

class Contact:Serializable {

    var name: String? = null
    var numbers = mutableListOf<String>()

    constructor(name: String?, numbers: MutableList<String>) {
        this.name = name
        this.numbers = numbers
    }
}