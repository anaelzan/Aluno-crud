package com.SenaiAna.Aluno_crud.service;

import com.SenaiAna.Aluno_crud.Interface.AlunoRepository;
import com.SenaiAna.Aluno_crud.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository){ this.repository = repository;
    }


    public List<Aluno> listarTodos(){
        return repository.findAll();
    }
    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }
    public void deletar(Long id){
        repository.deleteAllById(id);

    }
    public  Aluno buscarPorId (Long id){
        return repository.findById(id).orElse(null);

    }
}