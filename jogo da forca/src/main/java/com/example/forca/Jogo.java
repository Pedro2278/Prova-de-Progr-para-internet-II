package com.example.forca;

import java.util.HashSet;
import java.util.Set;

public class Jogo {

    private String palavra;
    private Set<Character> letrasCorretas;
    private Set<Character> letrasErradas;
    private int tentativas;

    public Jogo(String palavra) {
        this.palavra = palavra;
        this.letrasCorretas = new HashSet<>();
        this.letrasErradas = new HashSet<>();
        this.tentativas = 6; // Número de tentativas do jogo
    }

    public String getPalavra() {
        return palavra;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void processarJogada(String letra) {
        if (letra != null && letra.length() == 1) {
            char letraChar = letra.charAt(0);
            if (palavra.contains(String.valueOf(letraChar))) {
                letrasCorretas.add(letraChar);
            } else {
                letrasErradas.add(letraChar);
                tentativas--;
            }
        }
    }

    public Set<Character> getLetrasCorretas() {
        return letrasCorretas;
    }

    public Set<Character> getLetrasErradas() {
        return letrasErradas;
    }

    public boolean isGameOver() {
        return tentativas <= 0 || palavraRevelada().equals(palavra);
    }

    public String palavraRevelada() {
        StringBuilder revealed = new StringBuilder();
        for (char c : palavra.toCharArray()) {
            if (letrasCorretas.contains(c)) {
                revealed.append(c);
            } else {
                revealed.append("_");
            }
        }
        return revealed.toString();
    }
}
