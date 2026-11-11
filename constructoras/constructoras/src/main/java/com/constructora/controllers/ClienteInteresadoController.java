package com.constructora.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constructora.dto.ClienteInteresadoRequestDTO;
import com.constructora.dto.ClienteInteresadoResponseDTO;
import com.constructora.services.ClienteInteresadoService;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("api/clientes-interesados")
public class ClienteInteresadoController 
{
    private final ClienteInteresadoService clienteInteresadoService;

    public ClienteInteresadoController(ClienteInteresadoService clienteInteresadoService) {
        this.clienteInteresadoService = clienteInteresadoService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteInteresadoResponseDTO>> obtenerTodos() {
        return ResponseEntity.ok(clienteInteresadoService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteInteresadoResponseDTO> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteInteresadoService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteInteresadoResponseDTO> crear
        (@Valid @RequestBody ClienteInteresadoRequestDTO dto) {
        ClienteInteresadoResponseDTO clienteCreado = clienteInteresadoService.crear(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        clienteInteresadoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
