import java.io.*;
import java.util.*;

class Reinjdirizzamento{
    public static ArrayList<ParaQr> elenco = new ArrayList<ParaQr>();

    public static void carica(){
        System.out.println("sto caricando il database");
        elenco.add(new ParaQr("0", "bbbb"));
    }

    public static void leggi(String link){
        ParaQr qr = new ParaQr();
        qr.setLink(link);
        System.out.println(link);
        
        //scorro tutta la tabella fin quando il codice meccia
        for(ParaQr indice : elenco){
            if(qr.codice == indice.getCodice()){
                System.out.println("corrispondenza trovata");
                System.out.println(qr.codice);
                qr.setCodice(qr.codice);
            }
        }
    }
    public static void main(String[] args){
        String link = "bbbb";

        carica(); //caricare nella tabella l'elenco dei codici collegati a ogni singolo qr code

        leggi(link);
    }
}