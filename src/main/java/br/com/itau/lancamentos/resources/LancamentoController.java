package br.com.itau.lancamentos.resources;

import br.com.itau.lancamentos.domain.LancamentoDTO;
import br.com.itau.lancamentos.service.LancamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
@RequiredArgsConstructor
public class LancamentoController {

    private final LancamentoService service;

    @GetMapping
    public List<LancamentoDTO> getLancamentos() {
        return service.getLancamentos();
    }
}
