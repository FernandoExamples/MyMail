package com.udemy.fernando.mymail.Model;


import java.util.ArrayList;
import java.util.List;

public class MyUtils {

    public static int getRandomColor() {
        int color = (int) (Math.random() * 4);
        switch (color) {
            case 0:
                return android.R.color.holo_blue_bright;
            case 1:
                return android.R.color.holo_green_light;
            case 2:
                return android.R.color.holo_orange_light;
            case 3:
                return android.R.color.holo_red_light;
            case 4:
                return android.R.color.holo_purple;
        }

        return android.R.color.holo_blue_light;
    }

    public static List<Email> getDummyEmails(){
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("Talent Network", "¡Asi se vivio Jalisco Talent Land 2019!", "Durante" +
                " una semana Guadalajara fue testigo de una verdadera celebracion tecnologica, en donde se demostro que Mexico" +
                " cuenta con un verdadero talento que mira con innovacion el futuro", getRandomColor(), "26 abr."));

        emails.add(new Email("Comunicacion Lince", "Nuevo Accesso a Campus 2",
                "Se les recuerda que a partir del día de mañana lunes 29 de abril se habilitará el nuevo acceso a " +
                        "Campus 2 en frente de UTIC's", getRandomColor(), "28 abr."));

        emails.add(new Email("Eventbrite", "Tus entradas para el evento Talent Land", "Todo listo, " +
                "puedes recoger tus entradas pinchando en el siguiente enlace\n" +
                "(aqui deveria haber un enlace huevon cojonudo)", getRandomColor(), "24 abr."));

        emails.add(new Email("Talent Network", "¡Asi se vivio Jalisco Talent Land 2019!", "Durante" +
                " una semana Guadalajara fue testigo de una verdadera celebracion tecnologica, en donde se demostro que Mexico" +
                " cuenta con un verdadero talento que mira con innovacion el futuro", getRandomColor(), "26 abr."));

        emails.add(new Email("Comunicacion Lince", "Nuevo Accesso a Campus 2",
                "Se les recuerda que a partir del día de mañana lunes 29 de abril se habilitará el nuevo acceso a " +
                        "Campus 2 en frente de UTIC's", getRandomColor(), "28 abr."));

        emails.add(new Email("Eventbrite", "Tus entradas para el evento Talent Land", "Todo listo, " +
                "puedes recoger tus entradas pinchando en el siguiente enlace\n" +
                "(aqui deveria haber un enlace huevon cojonudo)", getRandomColor(), "24 abr."));

        emails.add(new Email("Talent Network", "¡Asi se vivio Jalisco Talent Land 2019!", "Durante" +
                " una semana Guadalajara fue testigo de una verdadera celebracion tecnologica, en donde se demostro que Mexico" +
                " cuenta con un verdadero talento que mira con innovacion el futuro", getRandomColor(), "26 abr."));

        emails.add(new Email("Comunicacion Lince", "Nuevo Accesso a Campus 2",
                "Se les recuerda que a partir del día de mañana lunes 29 de abril se habilitará el nuevo acceso a " +
                        "Campus 2 en frente de UTIC's", getRandomColor(), "28 abr."));

        emails.add(new Email("Eventbrite", "Tus entradas para el evento Talent Land", "Todo listo, " +
                "puedes recoger tus entradas pinchando en el siguiente enlace\n" +
                "(aqui deveria haber un enlace huevon cojonudo)", getRandomColor(), "24 abr."));

        emails.add(new Email("Talent Network", "¡Asi se vivio Jalisco Talent Land 2019!", "Durante" +
                " una semana Guadalajara fue testigo de una verdadera celebracion tecnologica, en donde se demostro que Mexico" +
                " cuenta con un verdadero talento que mira con innovacion el futuro", getRandomColor(), "26 abr."));

        emails.add(new Email("Comunicacion Lince", "Nuevo Accesso a Campus 2",
                "Se les recuerda que a partir del día de mañana lunes 29 de abril se habilitará el nuevo acceso a " +
                        "Campus 2 en frente de UTIC's", getRandomColor(), "28 abr."));

        emails.add(new Email("Eventbrite", "Tus entradas para el evento Talent Land", "Todo listo, " +
                "puedes recoger tus entradas pinchando en el siguiente enlace\n" +
                "(aqui deveria haber un enlace huevon cojonudo)", getRandomColor(), "24 abr."));

        return emails;
    }
}
