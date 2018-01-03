package de.swirtz.springwebflux.repository.domain

import org.springframework.data.annotation.Id

data class Configuration(@Id val id: String, val name: String, val value: String)