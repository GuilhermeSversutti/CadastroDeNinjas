package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    //DTO -- Objeto de transferencia de dados
    //DTO copia da entidade do banco de dados

    private long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private String rank;
    private MissoesModel missoes;
}
