package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }
    // CRUD

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")// Para adicionar
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/listar")// Mostrar
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // MOSTRAR NINJA POR ID (READ)
    @GetMapping("/listar/{id}")// Mostrar
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id) ;
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID") // Atualizar o recurso
    public String alterarNinjaPorId(){
        return "Alterar Ninja por ID";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID") // Para deletar
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
