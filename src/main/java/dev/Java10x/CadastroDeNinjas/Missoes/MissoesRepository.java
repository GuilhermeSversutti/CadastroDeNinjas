package dev.Java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA --  Faz abastração de codigo, dentro dele ja tem diversos métodos pre-feitos
// ORM - Vem junto com o JPA
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
