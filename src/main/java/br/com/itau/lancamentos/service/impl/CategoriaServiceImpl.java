package br.com.itau.lancamentos.service.impl;

import br.com.itau.lancamentos.domain.CategoriaDTO;
import br.com.itau.lancamentos.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Override
    public List<CategoriaDTO> getCategorias() {
        return List.of(
                new CategoriaDTO(1, "Mercado"),
                new CategoriaDTO(2, "Transporte"),
                new CategoriaDTO(3, "Roupas"),
                new CategoriaDTO(4, "Lazer"),
                new CategoriaDTO(5, "Comida"),
                new CategoriaDTO(6, "Compras Online")
        );
    }
}
