package br.com.itau.lancamentos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LancamentoDTO {

    private int id;
    private double valor;
    private String origem;
    private int categoria;
    @JsonProperty("mes_lancamento")
    private int mesLancamento;
}
