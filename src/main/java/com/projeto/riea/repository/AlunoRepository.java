package com.projeto.riea.repository;

import org.springframework.data.repository.CrudRepository;
import com.projeto.riea.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long>{

    Aluno findByUsername(String username);
    
}
