package de.swirtz.springwebflux.repository

import de.swirtz.springwebflux.repository.domain.Configuration
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository

interface ReactiveConfigurationRepository: ReactiveCassandraRepository<Configuration, String>