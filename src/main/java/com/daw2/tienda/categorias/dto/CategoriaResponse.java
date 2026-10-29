package com.daw2.tienda.categorias.dto;

public record CategoriaResponse(
        Long id,
        String nombre,
        Integer unidadesVendidas
)
{}
