package dev.Java10x.CadastroDeNinjas.Missoes;

import dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    //@OneToMany -- Uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
