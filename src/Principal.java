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


//        Pessoa p1 = new Pessoa(
//            "José Pereira da Silva",
//            LocalDate.of(1980, 12, 20),
//            "123-456",
//            "Brasil",
//            "SC",
//            "Tubarão"
//        );
//        System.out.println("Pessoa:");
//        System.out.println(p1);
//
//        Funcionario f1 = new Funcionario(
//            "Manoel da Silva",
//            LocalDate.of(1960, 01, 02),
//            "789-888",
//            "Brasil",
//            "SC",
//            "Jaguaruna",
//            "Serviços Gerais",
//            3000.0
//        );
//        System.out.println("Funcionário:");
//        System.out.println(f1);
//
//        Cliente c1 = new Cliente(
//                "Lionel Messi",
//                LocalDate.of(1970, 02, 10),
//                "454547848",
//                "Argentina",
//                "Abc",
//                "Buenos Aires",
//                true,
//                "Jogadô caro."
//        );
//        System.out.println("Cliente:");
//        System.out.println(c1);
//
//       Acomodacao a1 = new Acomodacao(
//            "Chalé Família",
//            400.0,
//            6,
//            "Isto é uma descrição"
//        );
//        System.out.println("Acomodação:");
//        System.out.println(a1);
//
//        MidiaAcomodacao ma1 = new MidiaAcomodacao(a1, TipoMidia.IMAGEM, "varanda.jpg");
//        System.out.println("Mídia acomodação:");
//        System.out.println(ma1);
//
//        Pacote pc1 = new Pacote("Combo Natal", a1, 4, 1500.0);
//        System.out.println("Pacote:");
//        System.out.println(pc1);
//
//        Reserva r1 = new Reserva(
//            a1,
//            c1,
//            2,
//            LocalDate.of(2023, 11, 14),
//            LocalDate.of(2023, 11, 16),
//            100.0
//        );
//        System.out.println("Reserva:");
//        System.out.println(r1);

//        Exemplo exemplo = new Exemplo("Isto é um texto", 99);
//        System.out.println("Exemplo:");
//        System.out.println(exemplo);
//
//      ExemploTest exemploTest = new ExemploTest();
//        System.out.println(exemploTest.testeCadastro("", 2222));
//        System.out.println(exemploTest.testeListagem());
//        System.out.println(exemploTest.testeAlteracao(5L, "Novo texto", 30));
//        System.out.println(exemploTest.testeExclusao());

        AcomodacaoTest acomodacaoTest = new AcomodacaoTest();
      System.out.println(acomodacaoTest.acomodacaoCadastro("Chale Lagoa", 899.00, 3, "Chale a beira da lagoa"));

       //System.out.println(acomodacaoTest.acomodacaoListagem());
        //System.out.println(acomodacaoTest.acomodacaoAlteracao(6L,"bh",500.00,5,""));

    }


}
