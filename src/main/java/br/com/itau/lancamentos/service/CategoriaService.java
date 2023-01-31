package br.com.itau.lancamentos.service;

import br.com.itau.lancamentos.domain.CategoriaDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> getCategorias();
}
