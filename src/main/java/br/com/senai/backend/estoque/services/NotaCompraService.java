package br.com.senai.backend.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.estoque.models.NotaCompra;
import br.com.senai.backend.estoque.repositories.NotaCompraRepository;


@Service
public class NotaCompraService {
        @Autowired
        private NotaCompraRepository ncRepository;

            public NotaCompra salvar(NotaCompra notacompra){
                return ncRepository.save(notacompra);

            }


}
