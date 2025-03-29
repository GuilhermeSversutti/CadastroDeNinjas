package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service // Camada de serviço
public class NinjaService {

    // Necessario inicializar o meu repository
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
}
