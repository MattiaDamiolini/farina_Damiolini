/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.damiolini_farina;

import java.io.IOException;

/**
 *
 * @author Andreina
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Archivio archivio = new Archivio();
		
 //CREAZIONE CLIENTI E VENDITE E SALVATAGGIO SU BIN
//		Cliente c1 = new Cliente("Pippo", "Pippo Franco", "PPPFRC");
//		Cliente c2 = new Cliente("Gerry", "Gerry Scotti", "GRYSCT");
//
//		Vendita v1 = new Vendita(c1, "Grano Duro", 10.5, 2.5, LocalDate.of(2021, 5, 22), null);
//		Vendita v2 = new Vendita(c1, "Tipo 00", 50, 10.5, LocalDate.of(2021, 2, 12), LocalDate.of(2021, 5, 20));
//		Vendita v3 = new Vendita(c2, "Tipo 1", 40, 8, LocalDate.of(2021, 4, 30), null);
//
//		archivio.registraVendita(v1);
//		archivio.registraVendita(v2);
//		archivio.registraVendita(v3);
//
//
//		try {
//			archivio.salvaVendite("Vendite.bin");
//			System.out.println("Scittura OK");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Impossibile scrivere sul file");
//		}
		

		//Caricamento da binario e inizializzazione archivio
		try {
			Vendita[] vendite = archivio.caricaVendite("Vendite.bin");
			for (int i = 0; i < vendite.length; i++) {
				archivio.registraVendita(vendite[i]);
			}
			System.out.println("Caricamento OK");
		} 
                catch (ClassNotFoundException e) {
		
                    System.out.println("Classe non trovata");
		} 
                catch (IOException e) {
			System.out.println("Impossibile leggere dal file");
		}

		//archivio.eliminaVendita(1);
		
		Vendita[] fattCliente = archivio.venditeCliente("Pippo");
		
		for (int i = 0; i < fattCliente.length; i++) {
			System.out.println(fattCliente[i].toString());
		}
	}
        
    }
