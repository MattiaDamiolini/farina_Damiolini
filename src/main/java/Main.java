


import java.time.LocalDateTime;
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
        String[] vociMenu=new String[8];
        int sceltaUtente=-1;
        Scanner tastiera=new Scanner(System.in);
        Ordinazioni o1=new Ordinazioni();
        Farina f1=new Farina();
        int codice1;
        
        
        vociMenu[0]="Esci";
        vociMenu[1]="Aggiungi vendita";
        vociMenu[2]="Rimuovi vendita ";
        vociMenu[3]="Paga vendita non ancora pagata";
        vociMenu[4]="Visualizza tutte le vendite ";
        vociMenu[5]="Visualizza i dati delle vendite di un cliente";
        vociMenu[6]="Esporta in CSV le vendite";
        vociMenu[7]="Salva su file binario";
        
        Menu menu=new Menu(vociMenu);
        
        do
        {
            sceltaUtente=menu.sceltaMenu();
            switch(sceltaUtente)
            {
                case 0:
                {
                    System.out.println("L'applicazione verrà chiusa");
                    break;
                }
                
                case 1:
                {
                    f1= new Farina(1, "Mario", "MAGD", "ksdgs4", "Grano", 10, 45, LocalDateTime.now(), LocalDateTime.now());
                    System.out.println(f1.getCodice());
                    System.out.println(f1.getNome());
                    break;
                }
                
                case 2:
                {
                    System.out.println("Inserire il codice per eliminare la vendita");
                    codice1=tastiera.nextInt();
                    o1.rimuoviOrdinazione(codice1);
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    break;
                }
                case 5:
                {
                    break;
                }
                case 6:
                {
                    break;
                }
                case 7:
                {
                    break;
                }
                
            }
        }while (sceltaUtente!=0);
        
    }
}
