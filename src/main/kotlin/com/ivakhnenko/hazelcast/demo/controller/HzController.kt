package com.ivakhnenko.hazelcast.demo.controller

import com.hazelcast.core.HazelcastInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("hz")
open class HzController {

    @Autowired
    lateinit var hazelcastInstance: HazelcastInstance

    @GetMapping("/all")
    fun getAll(): ResponseEntity<MutableMap<Int, String>> {
        val storage = hazelcastInstance.getMap<Int, String>("storage")

        return ResponseEntity(storage, HttpStatus.OK)
    }

    @PostMapping("/add/{id}/{value}")
    fun addValue(@PathVariable id: Int, @PathVariable value: String) {
        val storage = hazelcastInstance.getMap<Int, String>("storage")
        storage[id] = value
    }
}