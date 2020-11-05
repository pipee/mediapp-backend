package com.escalab.service.impl;

import com.escalab.model.Usuario;
import com.escalab.repo.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        Usuario usuario = repo.findOneByUsername(username);
//
//        if(usuario == null){
//            throw  new UsernameNotFoundException(String.format("Usuario no existe", username));
//        }
//        List<GrantedAuthority> roles = new ArrayList<>();
//        usuario.getRoles().forEach(rol ->{
//            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
//        });
        return null;
    }

}
