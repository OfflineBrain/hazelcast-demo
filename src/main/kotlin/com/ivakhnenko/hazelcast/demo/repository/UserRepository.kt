package com.ivakhnenko.hazelcast.demo.repository

import com.ivakhnenko.hazelcast.demo.model.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long>{
    fun findByUsername(username: String) : User?
}