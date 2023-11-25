package com.projeto.riea.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.projeto.riea.security.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().requiresChannel(
                channel -> channel.anyRequest().requiresSecure())
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers(HttpMethod.POST, "/cadastro").permitAll()
                                .requestMatchers(HttpMethod.GET, "/info/listar").permitAll()
                                .requestMatchers(HttpMethod.POST, "/professor").permitAll()
                                .requestMatchers(HttpMethod.GET, "/conteudo/listar").permitAll())
                .authorizeHttpRequests(
                        authorize -> authorize
                        .requestMatchers(HttpMethod.DELETE, "/cadastro/deletar/{id}").authenticated()
                        .requestMatchers(HttpMethod.GET, "/cadastro/listar").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/info/deletar/{id}").authenticated()
                        .requestMatchers(HttpMethod.POST, "/info").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/professor/deletar/{id}").authenticated()
                        .requestMatchers(HttpMethod.GET, "/professor/listar").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/conteudo/deletar/{id}").authenticated()
                        .requestMatchers(HttpMethod.POST, "/conteudo").authenticated())
                .httpBasic(Customizer.withDefaults())
;
        return http.build();
    }

    @Bean
    // Obrigátorio. Vai permitir criptografar as senhas das credenciais de login
    public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();    
    }

    // Novo método de UserDetailsServices
    @Bean
    public UserDetailsService myUserDetailsService() {
        // Retorna o Serviço de Detalhes de Usuario criado por nós!
        return new MyUserDetailService();
    }

    // Método removido
//     @Bean
//     public UserDetailsService userDetailsService() {
//         UserDetails user = User.withDefaultPasswordEncoder()
//                 .username("usuario")
//                 .password("senha")
//                 .build();

//         return new InMemoryUserDetailsManager(user);
//     }
}
