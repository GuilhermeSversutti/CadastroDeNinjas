package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // CRUD

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")// Para adicionar
    public String criarNinja(){
        return "Ninja Criado";
    }

    // MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/listar")// Mostrar
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninja";
    }
    // MOSTRAR NINJA POR ID (READ)
    @GetMapping("/listarID")// Mostrar
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja por ID";
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
