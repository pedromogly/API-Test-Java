package com.study.spring_study.Services;

import java.util.Map;

import org.springframework.stereotype.Service;
import com.study.spring_study.Services.Interfaces.Pagamento;

@Service
public class PagamentoFactory {
    private final Map<String, Pagamento> services;
    public PagamentoFactory(Map<String, Pagamento> services){
        this.services = services;
    }

    public Pagamento getService(String plan) {
        return services.get(plan);
    }
}
