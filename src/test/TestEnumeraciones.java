package test;

import enumeracion.Contintentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {

        //Al ser staticos publicos y finales podemos acceder a estos de la siguiente manera
        // System.out.println("Dia uno de la semana: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("ENUMERACION DE CONTINENTES");
        System.out.println("Continente Nro 4: " + Contintentes.AMERICA);
        System.out.println("Paises en el 4to continente: "
                + Contintentes.AMERICA.getPaises());
        System.out.println("Continente Nro 1: " + Contintentes.AFRICA);
        System.out.println("Paises en el 1er continente: "
                + Contintentes.AFRICA.getPaises());
    }

    //Utilizamos la enumeraicon para definir que dia de la semana es
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana: " + Dias.LUNES);
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana: " + Dias.MARTES);
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana: " + Dias.MIERCOLES);
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana: " + Dias.JUEVES);
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana: " + Dias.VIERNES);
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana: " + Dias.SABADO);
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana: " + Dias.DOMINGO);
                break;
            default:
                System.out.println("Error\nVuelva a ingresar un el dia correcto en MAYUSCULAS");

        }
    }
}
