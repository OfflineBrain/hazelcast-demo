package com.ivakhnenko.hazelcast.demo.config

import com.hazelcast.core.Hazelcast
import com.hazelcast.core.HazelcastInstance
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class HazelcastConfig {
    @Bean
    fun hazelcastInstance(): HazelcastInstance = Hazelcast.newHazelcastInstance()
}