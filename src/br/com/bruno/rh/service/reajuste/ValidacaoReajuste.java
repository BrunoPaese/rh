package br.com.bruno.rh.service.reajuste;

import br.com.bruno.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento);

}
