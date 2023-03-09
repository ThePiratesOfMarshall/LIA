import java.io.*;
import java.util.*;

class Reidirizzamento{
    public ArrayList<ParaQr> elenco = new ArrayList<ParaQr>();

    private void carica(){
        System.out.println("sto caricando il database");
    }

    private void leggi(String link){
        ParaQr qr;
        qr.setLink(link);
        System.out.println(link);
        
        //scorro tutta la tabella fin quando il codice meccia
        for(int i = 0; i < elenco.size(); i++){
            if(qr.codice == elenco.codice[i]){
                System.out.println("corrispondenza trovata");
                System.out.println(qr.codice);
                qr.setCodice(qr.codice);
            }
        }
    }
    public static void main(String[] args){
        String link;

        carica(); //caricare nella tabella l'elenco dei codici collegati a ogni singolo qr code

        leggi(link);
    }
}