package co.simplon;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import co.simplon.dao.ClientRepository;
import co.simplon.dao.CompteRepository;
import co.simplon.dao.OperationRepository;
import co.simplon.entities.Client;
import co.simplon.entities.Compte;
import co.simplon.entities.CompteCourant;
import co.simplon.entities.CompteEpargne;
import co.simplon.entities.Operation;
import co.simplon.entities.Retrait;
import co.simplon.entities.Versement;
import co.simplon.metier.IBanqueMetier;

@SpringBootApplication
public class MyBankApplication implements CommandLineRunner{

	
	  @Autowired private ClientRepository clientRepository;
	  
	  @Autowired private CompteRepository compteRepository;
	  
	  @Autowired private OperationRepository operationRepository;
	  
	  @Autowired private IBanqueMetier banqueMetier;
	 
	public static void main(String[] args) {
		SpringApplication.run(MyBankApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(MyBankApplication.class, args);
		ClientRepository clientRepository =  ctx.getBean(ClientRepository.class);
		clientRepository.save(new Client("alexis", "alexisetienne@gmail.com"));
		
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*
		 * Client c1 = clientRepository.save(new Client("alexis",
		 * "alexisetienne@gmail.com")) ; Client c2 = clientRepository.save(new
		 * Client("pierre", "pierre@gmail.com")) ;
		 * 
		 * Compte cp1 = compteRepository.save( new CompteCourant("cp1", new Date(),
		 * 90000, c1, 6000)); Compte cp2 = compteRepository.save( new
		 * CompteEpargne("cp2", new Date(), 6000, c2, 5.5));
		 * 
		 * operationRepository.save(new Versement(new Date(),9000 , cp1) );
		 * operationRepository.save(new Versement(new Date(),6000 , cp1) );
		 * operationRepository.save(new Versement(new Date(),2300 , cp1) );
		 * operationRepository.save(new Retrait(new Date(),9000 , cp1) );
		 * 
		 * operationRepository.save(new Versement(new Date(),2300 , cp2) );
		 * operationRepository.save(new Versement(new Date(),400 , cp2) );
		 * operationRepository.save(new Versement(new Date(),2300 , cp2) );
		 * operationRepository.save(new Retrait(new Date(),3000 , cp2) );
		 * 
		 * banqueMetier.verser("cp1", 111111);
		 */
		 
	}
}

