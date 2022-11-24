package br.com.ada.planodesaude.businessobject;

import br.com.ada.planodesaude.enumeracao.EnumTipoPlano;
import br.com.ada.planodesaude.modelo.pessoa.BeneficiarioTitular;

public class ContratacaoPlanoIndividual implements ContratacaoPlano{

    private ContratacaoPlano contratacaoPlano;
    private BeneficiarioTitular beneficiarioTitular;

    public ContratacaoPlanoIndividual(ContratacaoPlano contratacaoPlano, BeneficiarioTitular beneficiarioTitular){
        this.contratacaoPlano = contratacaoPlano;
        this.beneficiarioTitular = beneficiarioTitular;
    }

    public ContratacaoPlanoIndividual(BeneficiarioTitular beneficiarioTitular){
        this.beneficiarioTitular = beneficiarioTitular;
    }

    public ContratacaoPlano getContratacaoPlano() {
        return contratacaoPlano;
    }



    @Override
    public void assinaContrato() {
        if (beneficiarioTitular.isTitulavel() && beneficiarioTitular.getTipoPlano().equals(EnumTipoPlano.valueOf("INDIVIDUAL"))){
            System.out.println();
            System.out.println("Parabéns, " + beneficiarioTitular.getNome() + "!" + " Você acaba de contratar nosso plano de saúde individual!");
        } else {
            System.out.println();
            System.out.println("Os pré-requisitos de contratação não foram validados!");
        }
    }
}
