import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    //portée //static ou non //la sortie
    public static void main(String[] args) {
        int nb1= 10;
        int nb2=12;
        int nb3= nb1 + nb2;
        /**System.out.println("la somme des deux nombres est égale à " + (nb1+nb2) + ".");
        System.out.println("le résultat de la soustraction est égal à : " +(soustraction(50,8,25))); intervertir(20,100);
        soustraction(lire(),lire(),lire());
        System.out.println(scannerAsk()); **/
        System.out.println(afficherCategorie(5)); heure(new String[]{"heure"});


    }
    public static int afficherCategorie(int choix) {
        if (choix == 6 | choix == 7) {
            System.out.println("Tu es un poussin");
        } else if (choix == 7 | choix == 8) {
            System.out.println("Tu es une pupille");
        } else if (choix == 10 | choix == 11) {
            System.out.println("Tu es un minime");
        } else if (choix >= 12) {
            System.out.println("Tu es un cadet");
        } else {
            System.out.println("Age non catégorisé");
        }
        return choix;
    }
    //Ecrire une fonction qui demande à l’utilisateur un nombre dans la console compris entre 1 et 3 jusqu’à ce que la réponse convienne.
    public static int ask(Scanner scann, int nb){
        if (nb<=3){
            System.out.println("Well done");
        }
        else {

        }
    }
    //Exo heure: Fonction qui demande un nombre dans la console et le retourne
    public static float lire(Scanner scanner, String mess){
        System.out.println(mess);
        float nbr = scanner.nextFloat();
        return nbr;
    }
    public static String inOneminute(int hour, int min){
        //test si les minutes sont égales à 59
        if(min==59){
            //on passe les minutes à 0
            min=0;
            //on passe l'heure à 0
            if(hour==23){
                hour=0;
            }
            //on incrémente l'heure
            else{
                hour++;
            }
        }
        //on incrémente les minutes
        else{
            min++;
        }
        return "Dans une minute il sera :"+ hour+":"+min;
    }
    //Exo heure: afficher l'heure en console pour la minute d'avant
    public static void heure(String[] args) {
        Instant instant = Instant.now ();
        Instant instantMinEarlier = instant.minus ( 1 , ChronoUnit.MINUTES );

        System.out.println("Il y a une minute il etait : " + instantMinEarlier);
    }

    public void categorieAvecSwitch(int choix){

        switch(choix){

            case 1:
                System.out.println("Poussin");
                break;

            case 2:
                System.out.println("Pupille");
                break;

            case 3:
                System.out.println("Minime");
                break;
            default:
                System.out.println("Pas de ton âge");
                break;
        }

    }

    public static int lire(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr;

    }

    /**Exercice 5 scanner :
    Ecrire une fonction qui demande(scanner) le prix HT d’un article, la quantité d’articles et le taux de TVA dans la console, et qui retourne le prix total TTC correspondant.
    Faire en sorte que des libellés apparaissent clairement**/

    public static float scannerAsk(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le prix HT de l'article");
        int prixHt = scanner.nextInt();
        System.out.println("Quantité d'article");
        int quantité = scanner.nextInt();
        System.out.println("Saisir le taux");
        int tauxTva = scanner.nextInt();
        return (prixHt+quantité)/tauxTva;
    }

    //instancier un objet Scanner : permet de récupérer le prochain élément de la console
    Scanner scanner = new Scanner(System.in);
    //affichage d'une chaine dans la console
        System.out.println("Saisir un nombre");
    //instance d'une variable int pour stocker le nbr (int) saisi
    int nbr = scanner.nextInt();
    //affichage dans la console du résultat
        System.out.println("le nombre saisi est : ");
    //Exercice 2 fonctions :
    /**Ecrire une fonction qui va s’appeler soustraction et qui va prendre en paramètre 3 entiers i, j et k et va retourner la soustraction des nombres en entrée.
            NB :* la fonction sera statique **/

    public static int soustraction (int i, int j, int k){
        return i-j-k;
    }

    public static void intervertir (int i, int j){
        int change = i;
        i=j;
        i= change;
    }



    //variables = typage +nom (pas besoin de mot clef)
    boolean active = true;
    //les variables sont verrouillées on ne peut pas les changer
    int nbr = 10;

    //pour une chaine de caractere il faudra toujours appeler la classe
    String texte = "exercice";

}