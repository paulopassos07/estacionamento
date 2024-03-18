package br.com.passos.estacionamento.repository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.passos.estacionamento.domain.Vaga;
import br.com.passos.estacionamento.domain.Veiculo;

@Configuration
public class TesteJpa implements CommandLineRunner{

    @Autowired
    private VagaRepository vagaRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Veiculo veiculo1 = new Veiculo("qwe-1213", "BYD", "titam");
        Veiculo veiculo2 = new Veiculo("ghe-0013", "VW", "gol");
        Veiculo veiculo3 = new Veiculo("bbb-6789", "Ford", "Ka");

        Vaga vaga1 = new Vaga(1, false);
        Vaga vaga2 = new Vaga(2, false);
        Vaga vaga3 = new Vaga(3, false);

        veiculoRepository.saveAll(Arrays.asList(veiculo1, veiculo2, veiculo3));

        vagaRepository.saveAll(Arrays.asList(vaga1, vaga2, vaga3));
        
    }
    
}
