package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// JPA = Java Persistence API

// ENTITY = Ela é usada para marcar uma classe como entidade persistente
@Entity
// TABLE = Ela define as propriedades de mapeamento entre a entidade e a tabela do banco de dados
@Table(name = "tb_cadastro")

// Lombok
@Data // Cria todos os Getters E Setters
@NoArgsConstructor // Cria os construtores sem argumentos
@AllArgsConstructor // Cria os construtores com argumentos

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @Column(unique = true) // Essa coluna precisa ser unica, nao pode ter duplicata
    private String email;

    private int idade;

    // @ManyToOne -- Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Forneing key ou Chave Estrangeira
    private MissoesModel missoes;



}
