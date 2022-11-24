package br.com.ada.planodesaude.modelo.pessoa;

import br.com.ada.planodesaude.enumeracao.EnumTipoPlano;

import java.util.ArrayList;
import java.util.List;

public class BeneficiarioTitular extends Beneficiario {
    private EnumTipoPlano tipoPlano;
    private List<BeneficiarioDependente> beneficiariosDependentes;

    public BeneficiarioTitular(String matricula, String nome, String cpf, int idade, String nomeDaMae, Endereco endereco, EnumTipoPlano tipoPlano, List<BeneficiarioDependente> beneficiariosDependentes) {
        super(true, matricula, nome, cpf, idade, nomeDaMae, endereco);
        this.tipoPlano = tipoPlano;
        this.beneficiariosDependentes = beneficiariosDependentes;
    }

    public EnumTipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(EnumTipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public List<BeneficiarioDependente> getBeneficiariosDependentes() {
        return beneficiariosDependentes;
    }

    public void setBeneficiariosDependentes(List<BeneficiarioDependente> beneficiariosDependentes) {
        this.beneficiariosDependentes = beneficiariosDependentes;
    }
}
