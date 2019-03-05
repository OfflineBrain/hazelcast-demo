package com.ivakhnenko.hazelcast.demo.model.entity

import org.springframework.data.annotation.Id
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
        @Id @Column(name = "user_id") val id: Long = 0,
        @Column(name = "username") val username: String,
        @Column(name = "password") val password: String)