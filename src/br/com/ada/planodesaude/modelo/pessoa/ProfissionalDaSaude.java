package br.com.ada.planodesaude.modelo.pessoa;

import br.com.ada.planodesaude.enumeracao.EnumEspecialidade;

public class ProfissionalDaSaude {
    private String nome;
    private EnumEspecialidade especialidade;
    private String numeroConselho;

    public ProfissionalDaSaude(String nome, EnumEspecialidade especialidade, String numeroConselho) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.numeroConselho = numeroConselho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEspecialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EnumEspecialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }
}
