package br.com.ada.planodesaude.teste;

import br.com.ada.planodesaude.businessobject.ContratacaoPlano;
import br.com.ada.planodesaude.businessobject.ContratacaoPlanoFamiliar;
import br.com.ada.planodesaude.businessobject.ContratacaoPlanoIndividual;
import br.com.ada.planodesaude.enumeracao.EnumTipoPlano;
import br.com.ada.planodesaude.modelo.pessoa.*;
import br.com.ada.planodesaude.repository.Repository;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco1 = new EnderecoBuilder()
                .bairro("Capim Macio")
                .cidade("Natal")
                .estado("RN")
                .rua("Pastor Gabino Brelaz")
                .cep("59082-010")
                .numero("1401")
                .build();

        System.out.println(endereco1);

        Endereco endereco2 = new EnderecoBuilder()
                .bairro("Asa Norte")
                .cidade("Brasília")
                .estado("DF")
                .rua("-")
                .cep("70763-100")
                .numero("0")
                .build();

        System.out.println(endereco2);

        // cadastro de um beneficiário titular de um plano de saúde com interesse no plano familiar
        BeneficiarioTitular beneficiarioTitular1 = new BeneficiarioTitular("123", "Eulália", "111.111.444-01", 24, "Francisca", endereco1, EnumTipoPlano.FAMILIAR, null);
        System.out.println(beneficiarioTitular1);

        // contratação do plano familiar
        ContratacaoPlano contratacaoPlano = new ContratacaoPlanoFamiliar(beneficiarioTitular1);
        contratacaoPlano.assinaContrato();

        // cadastro de beneficiários dependentes de beneficiarioTitular1
        BeneficiarioDependente beneficiarioDependente1 = new BeneficiarioDependente("456", "Renan", "222.222.222-02", 10, "Eulália", endereco1, beneficiarioTitular1);
        BeneficiarioDependente beneficiarioDependente2 = new BeneficiarioDependente("789", "Joana", "333.333.333-03", 5, "Eulália", endereco1, beneficiarioTitular1);
        BeneficiarioDependente beneficiarioDependente3 = new BeneficiarioDependente("1011", "Marcos", "444.444.444-04", 14, "Eulália", endereco1, beneficiarioTitular1);

        // adição dos beneficiários dependentes ao repositório
        Repository<BeneficiarioDependente> repositoryDependentesDoTitular1 = new Repository<>();
        repositoryDependentesDoTitular1.cadastra(beneficiarioDependente1);
        repositoryDependentesDoTitular1.cadastra(beneficiarioDependente2);
        repositoryDependentesDoTitular1.cadastra(beneficiarioDependente3);

        // impressão do repositório
        repositoryDependentesDoTitular1.imprimeCadastrados();

        // remoção do cadastrado na posição indicada pelo parâmetro do método
        repositoryDependentesDoTitular1.removeCadastrado(2);

        // impressão do novo repositório
        System.out.println("_____________BENEFICIÁRIOS DEPENDENDES DO TITULAR QUE FORAM CADASTRADOS:_____________");
        repositoryDependentesDoTitular1.imprimeCadastrados();

        // cadastro de beneficiário com interesse no plano de saúde individual
        BeneficiarioTitular beneficiarioTitular2 = new BeneficiarioTitular("636", "Nelson", "111.999.444-01", 55, "Maria Baica", endereco1, EnumTipoPlano.INDIVIDUAL, null);

        // contratação do plano individual
        ContratacaoPlano contratacaoPlano2 = new ContratacaoPlanoIndividual(beneficiarioTitular2);
        contratacaoPlano2.assinaContrato();

        // adição dos beneficiários titulares a um novo repositório
        Repository<Beneficiario> repositoryTitulares = new Repository<>();
        repositoryTitulares.cadastra(beneficiarioTitular1);
        repositoryTitulares.cadastra(beneficiarioTitular2);

        // impressão do repositório
        System.out.println("_____________BENEFICIÁRIOS TITULARES CADASTRADOS:_____________");
        repositoryTitulares.imprimeCadastrados();

        // criação de repositório com todos os beneficiários cadastrados
        Repository<Beneficiario> repositoryTodosBeneficiarios = new Repository<>();
        repositoryTodosBeneficiarios.cadastra(beneficiarioDependente1);
        repositoryTodosBeneficiarios.cadastra(beneficiarioDependente2);
        repositoryTodosBeneficiarios.cadastra(beneficiarioDependente3);
        repositoryTodosBeneficiarios.cadastra(beneficiarioTitular1);
        repositoryTodosBeneficiarios.cadastra(beneficiarioTitular2);

        // impressão do repositório
        System.out.println("_____________TODOS OS BENEFICIÁRIOS CADASTRADOS:_____________");
        repositoryTodosBeneficiarios.imprimeCadastrados();











    }
}
