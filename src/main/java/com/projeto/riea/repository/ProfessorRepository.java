package com.projeto.riea.repository;

import org.springframework.data.repository.CrudRepository;
import com.projeto.riea.model.Professor;
 
public interface ProfessorRepository extends CrudRepository<Professor, Long> {
    
}
