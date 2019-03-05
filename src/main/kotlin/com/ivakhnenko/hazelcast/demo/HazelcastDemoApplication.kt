package com.ivakhnenko.hazelcast.demo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class HazelcastDemoApplication

fun main(args: Array<String>) {
    runApplication<HazelcastDemoApplication>(*args)
}

