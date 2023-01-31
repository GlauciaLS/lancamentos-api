package br.com.itau.lancamentos.resources;

import br.com.itau.lancamentos.domain.CategoriaDTO;
import br.com.itau.lancamentos.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> getCategorias() {
        return categoriaService.getCategorias();
    }
}
