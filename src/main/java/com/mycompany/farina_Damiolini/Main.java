/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.EccezionePosizioneNonVuota;
import eccezioni.EccezionePosizioneVuota;
import eccezioni.FileException;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreina
 */
public class Main 
{
    public static void main(String[] args) {
        
        int sceltaUtente =-1;
        int esitoOperazione = 0;       
        Scanner tastiera= new Scanner(System.in);
        String[] vociMenu= new String[7];
        String nomeFileCSV="FarinaVenduta.txt";
        String nomeFileBinario= "Vendite.bin";
        Archivio archivio = new Archivio();
        Vendita vendita = null;
        Cliente cliente =null ;
        
        
        vociMenu[0] = "Esci";
        vociMenu[1] = "Aggiungi una vendita";
        vociMenu[2] = "Rimuovi una vendita ";
        vociMenu[3] = "Visualizza le vendite ";
        vociMenu[4] = "Visualizza le vendite in ordine di importo";
        vociMenu[5] = "Salva file";
        vociMenu[6] = "Esporta file CSV";

		try 
                {
			Vendita[] vendite = archivio.caricaVendite("Vendite.bin");
			System.out.println("Caricamento OK");
		} 
                catch (ClassNotFoundException e) 
                {
		
                    System.out.println("Classe non trovata");
		} 
                catch (IOException e) 
                {
			System.out.println("Impossibile leggere dal file");
		}
                
    Menu menu= new Menu(vociMenu);   
        do
        {
            try
            {
                 sceltaUtente=menu.sceltaMenu();
            switch(sceltaUtente)
            {
                case 0:
                {
                    System.out.println("L'applicazione terminerà");
                    break;
                }
                case 1:
                {
                    //aggiunta una vendita
                    vendita = new Vendita();
                    cliente = new Cliente();
   
                        System.out.println("Nome del cliente-->");
                        cliente.setNome(tastiera.nextLine());
                        System.out.println("Cognome del cliente del cliente -->");
                        cliente.setCognome(tastiera.nextLine());
                        System.out.println("Inserire il codice Fiscale-->");
                        cliente.setCodiceFiscale(tastiera.nextLine());
                        System.out.println("Inserire il tipo di farina(0: grano duro; 1: grano tenero; 2:castagne; 3:mais)--> ");
                        vendita.setTipoFarina(tastiera.nextInt());
                        System.out.println("Inserire la quantità di farina in kg--> ");
                        vendita.setQtaVenduta(tastiera.nextDouble());
                        System.out.println("Il tuo importo da pagare è:  "+ vendita.getImporto());
                        tastiera.nextLine();
                        archivio.registraVendita(vendita);
                    
                    break;
                }

                 case 2:
                {
                    //elimina vendita
                    System.out.println("inserire il codice identificativo-->");                  
                    archivio.eliminaVendita(tastiera.nextInt());
                    System.out.println("vendita eliminata correttamente");
                    tastiera.nextLine();
                    break;
                }
                 case 3:
                {
                    //visualizza
                    System.out.println(archivio.toString());
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                }
                 case 4:
                 {
                     Vendita[] elencoVendite;
                     try
                     {
                         elencoVendite=archivio.elencoVenditeOrdinate();
                     for(int i=0;i<elencoVendite.length;i++)
                     {
                         System.out.println(elencoVendite[i].toString() );
                     }
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     
                     break;
                 }
                 case 5:
                {
                    try 
                        {
                            archivio.salvaVendite(nomeFileBinario);
                            System.out.println("Dati salvati correttamente");
                        } catch (IOException ex) 
                        {
                            System.out.println("Impossibile accedere al file in scrittura");
                        }
                    break;
                }
                 
                case 6: 
                 {
                     try
                     {
                         archivio.esportaVendite(nomeFileCSV);
                         System.out.println("Esportazione effettuato correttamente su file CSV");
                     }
                     catch(IOException e1)
                     {
                             System.out.println("Impossibile accedere al file. le vendite non sono state salvate");
                     } 
                     catch (FileException ex)
                     {
                         System.out.println("file non presente");
                     }

                     break;
                 }
                 
            }   
            }
            catch(InputMismatchException | NumberFormatException e1)
            {
                tastiera.nextLine();
                System.out.println("Input non corretto");
            }
           
            
        }while(sceltaUtente!=0);
	}
        
    }
