package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";
        String ss3 = "provola piccante con prosciutto";

        //crea un conteggia l'intervallo di caratteri di string1 fino al carattere dichiarato.
        //in questo caso ottiene il valore 6
        int index = string1.indexOf(" ");

        //con substring prendiamo un range di caratteri
        //in questo caso partiamo dal primo carattere (posizione 0) conta index (6) caratteri
        String sub1 = string1.substring(0, index);
        //in quest'altro caso con substring partiamo dalla posozione index (6) +1 per saltare il carattere " ".
        //non inserendo un secondo valore, restituirà tutto ciò che si trova dopo il punto indicato
        String sub2 = string1.substring(index+1);

        char[] charArray = (sub1 + " " + string2 + " " + sub2).toUpperCase().toCharArray();
        System.out.println(charArray);
    }
}
