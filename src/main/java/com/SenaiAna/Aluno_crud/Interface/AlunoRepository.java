package com.SenaiAna.Aluno_crud.Interface;

import com.SenaiAna.Aluno_crud.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    void deleteAllById(Long id);
}
