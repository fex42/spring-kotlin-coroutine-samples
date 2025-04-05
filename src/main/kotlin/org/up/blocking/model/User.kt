package org.up.blocking.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType


@Entity(name = "users")
data class UserJpa(
        @field: jakarta.persistence.Id @field: GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        @field:Column("user_name")
        val userName: String,
        val email: String,
        @field:Column("email_verified")
        val emailVerified:Boolean,
        @field:Column("avatar_url")
        val avatarUrl: String?) {

}
