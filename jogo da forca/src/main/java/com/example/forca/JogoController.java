package com.example.forca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JogoController {

    @RequestMapping("/game")
    public String jogo(Model model) {
        try {
            // Código para adicionar dados ao modelo ou outras preparações
            model.addAttribute("message", "Bem-vindo ao Jogo da Forca");
            return "game";  // Retorna a view game.html
        } catch (Exception e) {
            e.printStackTrace();  // Registra o erro no log
            model.addAttribute("errorMessage", "Ocorreu um erro inesperado.");
            return "error";  // Retorna a página de erro
        }
    }
}
