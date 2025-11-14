package com.study.spring_study.Services;

import org.springframework.stereotype.Service;

import com.study.spring_study.Services.Interfaces.Pagamento;

@Service("cartao")
public class PagamentoCartao implements Pagamento{

    @Override
    public String pagar() {
        return "Pagando via Cartao";
    }
    
}
