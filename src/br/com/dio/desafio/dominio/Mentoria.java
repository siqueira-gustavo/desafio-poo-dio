package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\tMentoria:\n\t{" +
                "\n\t\ttitulo: '" + getTitulo() + '\'' +
                ",\n\t\tdescricao: '" + getDescricao() + '\'' +
                ",\n\t\tdata: " + data +
                '\n' +'\t'+ "}" + "\n";
    }
}
