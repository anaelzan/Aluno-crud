package com.projeto.ana.Interface;

import com.projeto.ana.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    void deleteAllById(Long id);
}
