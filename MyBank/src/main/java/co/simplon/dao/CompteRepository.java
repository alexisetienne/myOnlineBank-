package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.simplon.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

	@Query("select c from Compte c where c.codeCompte=:x")
    public Compte findOne(@Param("x")String codeCpte);
}
