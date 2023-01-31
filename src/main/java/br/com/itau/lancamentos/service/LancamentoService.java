package br.com.itau.lancamentos.service;

import br.com.itau.lancamentos.domain.LancamentoDTO;

import java.util.List;

public interface LancamentoService {

    List<LancamentoDTO> getLancamentos();
}
