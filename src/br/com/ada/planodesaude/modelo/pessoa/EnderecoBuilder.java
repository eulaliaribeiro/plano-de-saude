package br.com.ada.planodesaude.modelo.pessoa;

public class EnderecoBuilder {
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public EnderecoBuilder rua(String rua) {
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder numero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Endereco build(){
        Endereco enderecoCriado = new Endereco(rua, numero, cep, bairro, cidade, estado);
        return enderecoCriado;
    }
}
