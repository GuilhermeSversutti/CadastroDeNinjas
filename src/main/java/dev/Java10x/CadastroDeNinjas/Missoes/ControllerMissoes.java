package dev.Java10x.CadastroDeNinjas.Missoes;

//LOCALHOST:8080 UMA ROTA PARA O SERVIDOR/ROTA

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Diz que vai ser uma rota para as minhas APIs
@RequestMapping("missoes") // Mapear as minhas APIs
public class ControllerMissoes {

    // GET -- Mandar uma requisição para mostrar missoes
    @GetMapping("/listar")
    public String listarMissao(){
    return "Missoes listada com sucesso";
    }

    // Post -- Mandar uma requisição para criar missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }
    // DELETE -- Mandar uma requisição para apagar missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }
}
