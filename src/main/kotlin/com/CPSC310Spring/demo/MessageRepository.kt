// MessageRepository.kt
package com.CPSC310Spring.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, String>