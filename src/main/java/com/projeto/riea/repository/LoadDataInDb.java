package com.projeto.riea.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.boot.CommandLineRunner;

import com.projeto.riea.model.Aluno;

@Configuration
public class LoadDataInDb implements CommandLineRunner {
    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception{
        ArrayList<Aluno> novosAlunos = new ArrayList<>();
        novosAlunos.add(new Aluno("Carlos", "carlitos@gmail.com", "11912341234", "Exemplo", "carlos10", passwordEncoder.encode("1234")));
        novosAlunos.add(new Aluno("Mariana", "mariana@gmail.com", "11943214321", "Exemplo", "mariana4", passwordEncoder.encode("1234")));

        alunoRepository.saveAll(novosAlunos);
    }
}
