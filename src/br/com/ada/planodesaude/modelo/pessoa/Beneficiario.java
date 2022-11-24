package br.com.ada.planodesaude.modelo.pessoa;

public class Beneficiario implements Titulavel {

    private boolean isTitulavel;
    private String matricula;
    private String nome;
    private String cpf;
    private int idade;
    private String nomeDaMae;
    private Endereco endereco;


    public Beneficiario(boolean isTitulavel, String matricula, String nome, String cpf, int idade, String nomeDaMae, Endereco endereco) {
        this.isTitulavel = isTitulavel;
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nomeDaMae = nomeDaMae;
        this.endereco = endereco;
    }

    @Override
    public boolean isTitulavel() {
        return this.isTitulavel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setId(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "isTitulavel=" + isTitulavel +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", nomeDaMae='" + nomeDaMae + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
