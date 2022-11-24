package br.com.ada.planodesaude.modelo.pessoa;

public class BeneficiarioDependente extends Beneficiario {
    private BeneficiarioTitular beneficiarioTitular;

    public BeneficiarioDependente(String matricula, String nome, String cpf, int idade, String nomeDaMae, Endereco endereco, BeneficiarioTitular beneficiarioTitular) {
        super( false, matricula, nome, cpf, idade, nomeDaMae, endereco);
        this.beneficiarioTitular = beneficiarioTitular;
    }

    public BeneficiarioTitular getBeneficiarioTitular() {
        return beneficiarioTitular;
    }

    public void setBeneficiarioTitular(BeneficiarioTitular beneficiarioTitular) {
        this.beneficiarioTitular = beneficiarioTitular;
    }
}
