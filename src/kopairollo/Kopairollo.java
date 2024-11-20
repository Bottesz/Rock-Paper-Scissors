/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kopairollo;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PolgárBotond(SZF_202
 */
public class Kopairollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Ko", "Papír", "Ollo"};
        
        System.out.println("Udvozollek a Ko, Papir, Ollo jatekban!");
        System.out.println("Valassz: Ko, Papir vagy Ollo (ird be a szot pontosan):");

        // Játékos választása
        String playerChoice = scanner.nextLine();

        // Ellenőrizzük a bemenetet
        if (!playerChoice.equals("Ko") && !playerChoice.equals("Papir") && !playerChoice.equals("Ollo")) {
            System.out.println("Ervénytelen valasztas! Csak 'Ko', 'Papir' vagy 'Ollo' lehet.");
            return;
        }

        // Számítógép választása
        String computerChoice = choices[random.nextInt(3)];
        System.out.println("A szamitogép valasztasa: " + computerChoice);

        // Eredmény kiszámítása
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Dontetlen! Mindketten " + playerChoice + "-t valasztottatok.");
        } else if ((playerChoice.equals("Ko") && computerChoice.equals("Ollo")) ||
                   (playerChoice.equals("Papir") && computerChoice.equals("Ko")) ||
                   (playerChoice.equals("Ollo") && computerChoice.equals("Papír"))) {
            System.out.println("Gratulalok, nyertel! " + playerChoice + " legyozi a(z) " + computerChoice + "-t.");
        } else {
            System.out.println("Sajalom, vesztettel. " + computerChoice + " legyozi a(z) " + playerChoice + "-t.");
        }

        scanner.close();
    }
}
    
    
