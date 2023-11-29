import controller.ExemploController;
import model.*;
import model.enums.TipoMidia;
import test.AcomodacaoTest;
import test.ExemploTest;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        System.out.println("Protótipo de Aplicação para Gestão Hoteleira");

//        Exemplo exemplo = new Exemplo("Isto é um texto", 99);
//        System.out.println("Exemplo:");
//        System.out.println(exemplo);
//
        //   ExemploTest exemploTest = new ExemploTest();
//        System.out.println(exemploTest.testeCadastro("", 2222));
//        System.out.println(exemploTest.testeListagem());
        //System.out.println(exemploTest.testeAlteracao(7L, "Alterado", 30));
//        System.out.println(exemploTest.testeExc
        AcomodacaoTest acomodacaoTest = new AcomodacaoTest();
        System.out.println(acomodacaoTest.acomodacaoCadastro("Chalezao", 5.00, 1, ""));

        // System.out.println(acomodacaoTest.acomodacaoListagem());

        // System.out.println(acomodacaoTest.acomodacaoAlteracao(1L,"bh",500.00,5,"agora"));

    }


}
