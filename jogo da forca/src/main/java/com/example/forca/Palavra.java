package com.example.forca;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Palavra {

    private String palavraSecreta;
    private String palavraExibida;

    // Lista de palavras possíveis
    private static final List<String> PALAVRAS = Arrays.asList(
            "JAVA", "SPRING", "FORCA", "PROGRAMACAO", "DESENVOLVIMENTO", "ALGORITMO", "COMPUTADOR");

    // Construtor que escolhe uma palavra aleatória
    public Palavra() {
        Random random = new Random();
        this.palavraSecreta = PALAVRAS.get(random.nextInt(PALAVRAS.size()));
        this.palavraExibida = palavraSecreta.replaceAll(".", "_"); // Palavra secreta com os _ visíveis
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public String getPalavraExibida() {
        return palavraExibida;
    }

    public void revelarLetra(char letra) {
        StringBuilder palavraExibidaBuilder = new StringBuilder(palavraExibida);
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraExibidaBuilder.setCharAt(i, letra);
            }
        }
        palavraExibida = palavraExibidaBuilder.toString();
    }

    public boolean palavraRevelada() {
        return palavraSecreta.equals(palavraExibida);
    }
}
