package br.com.ada.planodesaude.modelo;

public class Beneficiario implements Titulavel {
    private boolean isTitulavel;
    private String nome;
    private String cpf;
    private String idade;
    private String nomeDaMae;
    private Endereco endereco;

    @Override
    public boolean isTitulavel() {
        return this.isTitulavel;
    }


}
