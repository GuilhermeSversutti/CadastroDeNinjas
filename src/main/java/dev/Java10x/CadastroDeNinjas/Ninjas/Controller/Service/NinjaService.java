package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    //Listar todos os ninjas por ID
    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
    //Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
    //Deletar ninja
    public void deletarNinjaPorId(long id){
        ninjaRepository.deleteById(id);
    }
}
