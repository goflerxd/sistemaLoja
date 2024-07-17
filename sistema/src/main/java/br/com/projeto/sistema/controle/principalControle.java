package br.com.projeto.sistema.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {

    @GetMapping("/administrativo/home")
    public String home() {
        return "administrativo/home";
    }
}
