package br.com.itau.lancamentos.service.impl;

import br.com.itau.lancamentos.domain.LancamentoDTO;
import br.com.itau.lancamentos.service.LancamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Override
    public List<LancamentoDTO> getLancamentos() {
        return List.of(
                new LancamentoDTO(1, 130.01, "Magazine Luíza", 1, 1),
                new LancamentoDTO(2, 10.50, "Extra Hipermercado", 1, 4),
                new LancamentoDTO(3, 27.99, "Uber", 2, 3),
                new LancamentoDTO(4, 12.70, "Renner", 3, 2),
                new LancamentoDTO(5, 15.22, "Livraria Curitiba", 4, 1),
                new LancamentoDTO(6, 21.89, "Uber", 2, 2),
                new LancamentoDTO(7, 12.50, "Livraria Curitiba", 4, 9),
                new LancamentoDTO(8, 60.75, "Mc Donalds", 5, 8),
                new LancamentoDTO(9, 93.25, "KFC", 5, 2),
                new LancamentoDTO(10, 230.78, "Outback", 5, 4),
                new LancamentoDTO(11, 7.90, "Uber", 2, 4),
                new LancamentoDTO(12, 15.43, "Uber", 2, 9),
                new LancamentoDTO(13, 153.11, "Riachuelo", 3, 8),
                new LancamentoDTO(14, 255.17, "Riachuelo", 3, 3),
                new LancamentoDTO(15, 1200.00, "Ponto Frio", 6, 2),
                new LancamentoDTO(16, 307.51, "Kabum", 6, 3),
                new LancamentoDTO(17, 299.90, "Casas Bahia", 6, 4),
                new LancamentoDTO(18, 430.75, "Magazine Luíza", 6, 2),
                new LancamentoDTO(19, 1000.00, "Zara", 3, 1),
                new LancamentoDTO(20, 100.00, "Outback", 5, 2),
                new LancamentoDTO(21, 300.00, "Coco Bambu", 5, 3),
                new LancamentoDTO(22, 71.29, "Uber", 2, 7)
        );
    }
}
