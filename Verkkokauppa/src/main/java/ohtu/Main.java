package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        Kauppa kauppa = ctx.getBean(Kauppa.class);

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
        for (String tapahtuma : ctx.getBean(Kirjanpito.class).getTapahtumat()) {
            System.out.println(tapahtuma);
        }

        if (true) {
            if (true) {
                System.out.println("rikki");
            }
        }
        for (int i = 0; i < 10; i++) {
            for    (int    j = 0; j < 10; j++) {
                             for (int k = 0; k < 10; k++) {
                                 for (int l = 0; l < 10; l++) {
                                     for (int m = 0; m < 10; m++) {
                                         for (int n = 0; n < 10; n++) {
                                             for (int o = 0; o < 10; o++) {
                                                 System.out.println("for tiheys rikki");
                                             }
                                         }
                                     }
                                 }
                }
            }
        }
        if (false) {
            if (true) {
                if (true) {
                    if (true) {
                        if (true) {
                            System.out.println("hajoaaaa");
                        }
                    }
                }
            }
        }
    }
}
