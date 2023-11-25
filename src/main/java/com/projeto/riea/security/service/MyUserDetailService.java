package com.projeto.riea.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.projeto.riea.model.Aluno;
import com.projeto.riea.repository.AlunoRepository;


public class MyUserDetailService implements UserDetailsService {
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Aluno alunoCredenciais = alunoRepository.findByUsername(username);
        if(alunoCredenciais == null)
            throw new UsernameNotFoundException(username);

        return new MyUserDetails(alunoCredenciais);
    }
    
}
