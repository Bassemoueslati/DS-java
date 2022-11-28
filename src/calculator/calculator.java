import java.util.Scanner;
public class calculator {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //initialisation la matrice Set1
        int[][] Set1 ={
            {1,3,5,7},
            {9,11,13,15},
            {17,19,21,23},
            {25,27,29,31}
        };
        //initialisation la matrice Set2
        int[][] Set2 ={
            {2,3,6,7},
            {10,11,14,15},
            {18,19,22,23},
            {26,27,30,31}
        };
        //initialisation la matrice Set3
        int[][] Set3 ={
            {4,5,6,7},
            {12,13,14,15},
            {20,21,22,23},
            {28,29,30,31}
        };
        //initialisation la matrice Set4
        int[][] Set4 ={
            {8,9,10,11},
            {12,13,14,15},
            {24,25,26,27},
            {28,29,30,31}
        };
        //initialisation la matrice Set5
        int[][] Set5 ={
            {16,17,18,19},
            {20,21,22,23},
            {24,25,26,27},
            {28,29,30,31}
        };
        // afficher un question si le jour existe dans la set :
        System.out.println("la Jour de Naissance dans la Set 1 :");
        printSet(Set1);
        // saisie le choix entrée :
        System.out.print("Entrer 0 pour Non et 1 pour Oui : ");
        String a = sc.nextLine();
        // afficher un question si le jour dans existela set :
        System.out.println("la Jour de Naissance dand la Set 2 :");
        printSet(Set2);
        // saisie le choix entrée :
        System.out.print(" 0 pour false and 1 for True : ");
        String b = sc.nextLine();
        // afficher un question si le jour exist dans la set :
        System.out.println("la Jour de Naissance dand la Set 3 :");
        printSet(Set3);
        // saisie le choix entrée tapez :
        System.out.print(" 0 pour false and 1 for True : ");
        String c = sc.nextLine();
        // afficher un question si le jour dans la set :
        System.out.println("la Jour de Naissance dand la Set 4 :");
        printSet(Set4);
        // saisie le choix tapez :
        System.out.print(" 0 pour false and 1 for True : ");
        String d = sc.nextLine();
        // afficher un question si le jour dans la set :
        System.out.println("la Jour de Naissance existe dans la Set5 :");
        printSet(Set5);
        // saisie le choix tapez  :
        System.out.print(" 0 pour false and 1 for True : ");
        String e = sc.nextLine();
        String word = a+b+c+d+e;
        // afficher la resultat :
        System.out.println("Ta Jour de Naissance est : " +binairyToInt(word) +" ?");
    }
    //affichage de la matrice 
    private static void printSet(int[][] Set1){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               System.out.print(Set1[i][j] + " ") ;
            }
            System.out.println();
         }
    }
    //convertir le String word qui contiant un nombre binaire --> un nombre decimal 
    private static int binairyToInt(String word){
        int Jour=Integer.parseInt(word, 2);
        return Jour;
    }
 }