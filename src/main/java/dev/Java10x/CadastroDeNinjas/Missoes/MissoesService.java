package dev.Java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {

    private MissoesRepository repository;
    private MissoesMapper mapper;

    public MissoesService(MissoesRepository repository, MissoesMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // Listar missões
    public List<MissoesDto> listarMissoes(){
        List<MissoesMolde> listar = repository.findAll();
        return listar.stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    // Listar por ID
    public MissoesDto listarPorId(long id){
        Optional<MissoesMolde> missoesId = repository.findById(id);
        return missoesId.map(mapper::map).orElse(null);
    }

    // Criar uma nova missão
    public MissoesDto criarMissao(MissoesDto dto){
        MissoesMolde molde = new MissoesMapper().map(dto);
        molde = repository.save(molde);
        return mapper.map(molde);
    }
    // Deletar missão
    public void deletarMissao(long id){
        repository.deleteById(id);
    }
    // Atualizar missão
    public MissoesDto atualizarMissao(long id, MissoesDto dto){
        Optional<MissoesMolde> atualizar = repository.findById(id);
        if (atualizar.isPresent()){
            MissoesMolde missaoAtualizada = mapper.map(dto);
            missaoAtualizada.setId(id);
            MissoesMolde missaoSalva = repository.save(missaoAtualizada);
            return mapper.map(missaoAtualizada);

        }return null;
    }
}
