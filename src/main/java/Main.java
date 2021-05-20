
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENTE
 */
public class Main
{
    public static void main(String[] args) 
    {
        String[] vociMenu=new String[7];
        int sceltaUtente=-1;
        Scanner tastiera=new Scanner(System.in);
        Ordinazioni o1=new Ordinazioni();
        
        
        vociMenu[0]="Esci";
        vociMenu[1]="Aggiungi vendita";
        vociMenu[2]="Rimuovi vendita ";
        vociMenu[3]="Paga vendita non ancora pagata";
        vociMenu[4]="Visualizza tutte le vendite ";
        vociMenu[5]="Visualizza i dati delle vendite di un cliente";
        vociMenu[6]="Esporta in CSV le vendite";
        vociMenu[7]="Salva su file binario";
        
        
    }
}
