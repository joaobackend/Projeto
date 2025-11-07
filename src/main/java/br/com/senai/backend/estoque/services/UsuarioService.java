package br.com.senai.backend.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.estoque.models.Usuario;
import br.com.senai.backend.estoque.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
        private UsuarioRepository uRepository;
            public Usuario salvar(Usuario usuario){
                return uRepository.save(usuario);
            }

}
