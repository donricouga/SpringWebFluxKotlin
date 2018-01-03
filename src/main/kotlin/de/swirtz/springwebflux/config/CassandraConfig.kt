package de.swirtz.springwebflux.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories

@Configuration
@EnableReactiveCassandraRepositories
class CassandraConfig: AbstractReactiveCassandraConfiguration() {

    override fun getKeyspaceName() = "client_configuration"

}