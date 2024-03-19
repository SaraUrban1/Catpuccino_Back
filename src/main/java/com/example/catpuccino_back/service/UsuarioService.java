package com.example.catpuccino_back.service;

import com.example.catpuccino_back.converter.UsuarioMapper;
import com.example.catpuccino_back.dto.UsuarioDTO;
import com.example.catpuccino_back.repository.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    //LISTAR
    public List<UsuarioDTO> listarUsuario() {return usuarioMapper.toDTO(usuarioRepository.findAll());}
}