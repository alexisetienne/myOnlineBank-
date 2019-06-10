package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
