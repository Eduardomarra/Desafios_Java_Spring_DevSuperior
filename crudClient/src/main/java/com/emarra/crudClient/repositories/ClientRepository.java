package com.emarra.crudClient.repositories;

import com.emarra.crudClient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
