package com.projeto.riea.security.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.projeto.riea.model.Aluno;

public class MyUserDetails implements UserDetails{
    private Aluno alunoDoSistema;

    public MyUserDetails(Aluno aluno){
        this.alunoDoSistema = aluno;
    }
    @Override
    // Ignorar este método
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return null;
    }

    @Override
    public String getPassword() {
        return this.alunoDoSistema.getPassword();
    }
    @Override
    public String getUsername() {
        return this.alunoDoSistema.getUsername();
    }
    @Override
    // Ignorar este método
    public boolean isAccountNonExpired() {
     return true;
    }

    @Override
    // Ignorar este método
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    // Ignorar este método
    public boolean isCredentialsNonExpired() {
       return true;
    }

    @Override
    // Ignorar este método
    public boolean isEnabled() {
        return true;
    }

}
