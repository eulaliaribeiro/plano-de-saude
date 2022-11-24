package br.com.ada.planodesaude.businessobject;

import br.com.ada.planodesaude.enumeracao.EnumTipoPlano;
import br.com.ada.planodesaude.modelo.pessoa.BeneficiarioTitular;

public class ContratacaoPlanoFamiliar implements ContratacaoPlano {

    private ContratacaoPlano contratacaoPlano;
    private BeneficiarioTitular beneficiarioTitular;

    public ContratacaoPlanoFamiliar(ContratacaoPlano contratacaoPlano, BeneficiarioTitular beneficiarioTitular){
        this.contratacaoPlano = contratacaoPlano;
        this.beneficiarioTitular = beneficiarioTitular;
    }

    public ContratacaoPlanoFamiliar(BeneficiarioTitular beneficiarioTitular){
        this.beneficiarioTitular = beneficiarioTitular;
    }

    public ContratacaoPlano getContratacaoPlano() {
        return contratacaoPlano;
    }

    @Override
    public void assinaContrato() {
        if(beneficiarioTitular.isTitulavel() && beneficiarioTitular.getTipoPlano().equals(EnumTipoPlano.valueOf("FAMILIAR"))){
            System.out.println();
            System.out.println("Parabéns, " + beneficiarioTitular.getNome() + "! Você contratou o nosso plano de saúde familiar!");
            System.out.println("Adicione seus dependentes a seguir!");
        } else {
            System.out.println();
            System.out.println("Os pré-requisitos de contratação não foram validados!");
        }

    }
}
