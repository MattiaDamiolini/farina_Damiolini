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
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andreina
 */
public class Main 
{
    public static void main(String[] args) {
        
        int sceltaUtente =-1;
        int esitoOperazione;       
        Scanner tastiera= new Scanner(System.in);
        String[] vociMenu= new String[6];
        String nomeFileCSV="libriScaffale.txt";
        String nomeFileBinario= "scaffale.bin";
        Archivio archivio = new Archivio();
        Vendita vendita = null;
        Cliente cliente = null;
        
        
        vociMenu[0] = "Esci";
        vociMenu[1] = "Aggiungi una vendita";
        vociMenu[2] = "Rimuovi una vendita ";
        vociMenu[3] = "Visualizza le vendite ";
        vociMenu[4] = "Salva file";
        vociMenu[5] = "Esporta file CSV";
        
        int scelta = 4;
                double importo1 = 0;
                switch(scelta)
                {
                    case 0:
                    {
                        importo1= vendita.getQtaVenduta()*1.5;
                        break;
                    }
                    case 1:
                    {
                        importo1=vendita.getQtaVenduta()*2;
                        break;
                    }
                    case 2:
                    {
                        importo1=vendita.getQtaVenduta()*2.5;
                        break;
                    }
                    case 3:
                    {
                        importo1=vendita.getQtaVenduta()*4.5;
                    }
                }
                
        
        

		

		/*try 
                {
			Vendita[] vendite = archivio.caricaVendite("Vendite.bin");
			for (int i = 0; i < vendite.length; i++) 
                        {
				archivio.registraVendita(vendite[i]);
			}
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
                */
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
                    
                    System.out.println("Nome del cliente-->");
                    cliente.setNome(tastiera.nextLine());
                    System.out.println("Inserire il codice Fiscale-->");
                    cliente.setCodiceFiscale(tastiera.nextLine());
                    System.out.println("Nominativo del cliente -->");
                    cliente.setNominativo(tastiera.nextLine());
                    System.out.println("Inserire il tipo di farina--> ");
                    vendita.setTipoFarina(tastiera.nextLine());
                    System.out.println("Inserire la quantità di farina in kg--> ");
                    vendita.setQtaVenduta(tastiera.nextDouble());
                    System.out.println("Il tuo importo da pagare è:  "+ vendita.setImporto(importo1));
                    System.out.println("premi un pulsante per continuare.!");
                    tastiera.nextLine();
                    break;
                }
                 case 2:
                {
                    //elimina vendita
                    System.out.println("inserire il codice identificativo-->");                  
                    archivio.eliminaVendita(tastiera.nextInt());
                    System.out.println("libro eliminato correttamente");
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();
                    break;
                
                    
                        
                }
                 case 4:
                {
                    /*//cerca libro in base  ad Autore
                    String[] elencoTitoli;
                    String autore;
                    System.out.println("Autore-->");
                    autore = tastiera.nextLine();
                    try
                    {
                        elencoTitoli = s1.elencoTitoliAutore(autore);
                         if (elencoTitoli == null)
                        System.out.println("nessun libro di "+autore);
                    else
                    {
                        for (int i=0;i<elencoTitoli.length;i++)
                             System.out.println(elencoTitoli[i]);
                    }
                    }
                    catch(EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                    
                   
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();*/
                    break;
                }
                 case 5:
                {
                    /*System.out.println(s1.toString()); 
                    System.out.println("premi un pulsante per continuare.");
                    tastiera.nextLine();*/
                    break;
                }
                 case 6:
                 {
                     /*try
                     {
                         System.out.println(s1.elencoAlfabeticoLibri());
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     */
                     break;
                 }
                 case 7:
                 {/*
                     Libro[] elencoLibri;
                     try
                     {
                         elencoLibri=s1.elencoLibriOrdinatiPrezzo();
                     for(int i=0;i<elencoLibri.length;i++)
                     {
                         System.out.println(elencoLibri[i].toString() +" € " + elencoLibri[i].prezzo());
                     }
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     */
                     break;
                 }
                 case 8:
                 {/*
                     Libro[] elencoLibri;
                     try
                     {
                         elencoLibri=s1.elencoLibriAlfabeticoAutoreTitolo();
                     for(int i=0;i<elencoLibri.length;i++)
                     {
                         System.out.println(elencoLibri[i].toString() +" € " + elencoLibri[i].prezzo());
                     }
                     }
                     catch(EccezionePosizioneNonValida e1)
                     {
                         System.out.println(e1.toString());
                     }
                     */
                     break;
                 }
                 case 9: 
                 {/*
                     try
                     {
                         s1.esportaLibri(nomeFileCSV);
                         System.out.println("Esportazione effettuato correttamente su file CSV");
                     }
                     catch(IOException e1)
                     {
                             System.out.println("Impossibile accedere al file. i libri non sono stati salvati");
                     }
                     catch(EccezionePosizioneNonValida | FileException e2)
                     {
                         System.out.println(e2.toString());
                     }*/
                     break;
                 }
                 case 10:
                 {/*
                     try 
                     {
                         //serializzazione
                         s1.salvaScaffale(nomeFileBinario);
                         System.out.println("dati salvati correttamente");
                     } 
                     catch (IOException ex) 
                     {
                         System.out.println("Impossibile accedere al file. i dati non sono stati salvati");
                     }*/
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
