package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
// JPA = Java Persistence API

// ENTITY = Ela é usada para marcar uma classe como entidade persistente
@Entity
// TABLE = Ela define as propriedades de mapeamento entre a entidade e a tabela do banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne -- Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Forneing key ou Chave Estrangeira
    private MissoesModel missoes;

    //No args = Contrutor sem argumentos
    public NinjaModel() {
    }

    // Al args = Construtor com argumentos
    public NinjaModel(long id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Getter e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
