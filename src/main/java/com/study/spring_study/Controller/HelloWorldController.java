package com.study.spring_study.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring_study.Services.JsonService;
import com.study.spring_study.Services.PagamentoFactory;
import com.study.spring_study.Services.Models.JsonExample;

@RestController
//Ou @Controller + @ResponseBody
@RequestMapping
public class HelloWorldController {
    private final PagamentoFactory pagamentoService;
    private final JsonService jsonService;
    public HelloWorldController(PagamentoFactory pagamento, JsonService jsonService){
        this.pagamentoService = pagamento;
        this.jsonService = jsonService;
    }

    @GetMapping("/pagar")
    public String gritar(String metodo){
        var service = pagamentoService.getService(metodo);
        return service.pagar();
    }
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "EAE MANO!!";
    }

    //router parameters
    @GetMapping("/macaco/{player}/{position}")
    public JsonExample getPlayer(@PathVariable String player,@PathVariable String position) {
        return new JsonExample(player, position);
    }

    //query params
    @GetMapping("/players")
    public JsonExample createPlayer(
        @RequestParam String player,
        @RequestParam String position
    ){
        return new JsonExample(player, position);
    }

    @PostMapping("/auth")
    public JsonExample logar(@RequestBody JsonExample body) {
        return body;
    }

    @PostMapping("/body")
    public JsonExample exibir(@RequestBody JsonExample json) {
        return jsonService.process(json);
    }
}

