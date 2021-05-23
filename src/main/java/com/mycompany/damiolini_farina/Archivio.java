/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.damiolini_farina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andreina
 */
public class Archivio 
{
    private int id = 0;
	private Vendita[] archivio;
	private static final int NUM_FATTURE = 3;
	
	public Archivio() 
        {
		archivio = new Vendita[NUM_FATTURE];
	}
	
	public void registraVendita(Vendita vendita) 
        {
		
		for (int i = 0; i < NUM_FATTURE; i++) 
		{
			if (archivio[i]==null)
			{
				vendita.setId(this.id += 1);
				archivio[i]=vendita;
				return;
			}	
		}
	}
	
	public boolean eliminaVendita(int id) {
		
		for (int i = 0; i < NUM_FATTURE; i++) {
			
			if (archivio[i].getId() == id) {
				archivio[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public Vendita[] venditeCliente(String nome) {
		Vendita[] result;
		int j = 0;
		
		for (int i = 0; i < NUM_FATTURE; i++) {
			if(archivio[i].getCliente().getNome().equalsIgnoreCase(nome)) {
				j += 1;
			}
		}
		
		result = new Vendita[j];
		j=0;
		
		for (int i = 0; i < NUM_FATTURE; i++) {
			if(archivio[i].getCliente().getNome().equalsIgnoreCase(nome)) {
				result[j] = archivio[i];
				j += 1;
			}
		}
		
		return result;
	}
	

	public void salvaVendite(String nomeFile) throws IOException
	{
		FileOutputStream file=new FileOutputStream(nomeFile);
		ObjectOutputStream writer=new ObjectOutputStream(file);
		
		writer.writeObject(archivio);
		writer.flush();
		file.close();
	}
	
	public Vendita[] caricaVendite(String nomeFile) throws IOException, ClassNotFoundException
	{
		FileInputStream file=new FileInputStream(nomeFile);
		ObjectInputStream reader= new ObjectInputStream(file);
		
		Vendita[] v;
		v = (Vendita[])reader.readObject();
		
		file.close();
		return v;
	}
	
	
}
