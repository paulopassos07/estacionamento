package br.com.passos.estacionamento.repository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.passos.estacionamento.model.Vacancy;
import br.com.passos.estacionamento.model.Vehicle;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestJpa implements CommandLineRunner{

    @Autowired
    private VacancyRepository vacancyRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Vehicle veiculo1 = new Vehicle("qwe-1213", "BYD", "titam");
        Vehicle veiculo2 = new Vehicle("ghe-0013", "VW", "gol");
        Vehicle veiculo3 = new Vehicle("bbb-6789", "Ford", "Ka");

        Vacancy vaga1 = new Vacancy(1, false);
        Vacancy vaga2 = new Vacancy(2, false);
        Vacancy vaga3 = new Vacancy(3, false);

        vehicleRepository.saveAll(Arrays.asList(veiculo1, veiculo2, veiculo3));

        vacancyRepository.saveAll(Arrays.asList(vaga1, vaga2, vaga3));
        
    }
    
}
