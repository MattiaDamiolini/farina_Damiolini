/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.FileException;
import file.TextFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import jdk.dynalink.linker.support.Guards;

/**
 *
 * @author Andreina
 */
public class Archivio 
{
    private int id = 0;
	private Vendita[] archivio;
        Cliente cliente = new Cliente();
	private static final int NUM_FATTURE = 100;
	
	public Archivio() 
        {
		archivio = new Vendita[NUM_FATTURE];
	}
        public Vendita getVendita(int posizione)
        {
            if(archivio[posizione]!=null)
            {
                return new Vendita(archivio[posizione]);
            }
        return null;
        }
        
        public int getNumVendite() throws EccezionePosizioneNonValida
        {
            int NVendite=0;
            for(int i=0;i<NUM_FATTURE;i++)
            {
                 if(archivio[i]!=null)
                {
                   NVendite++;
                }
        }
            return NVendite;
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
	
	public boolean eliminaVendita(int id) 
        {
		
		for (int i = 0; i < NUM_FATTURE; i++) 
                {
			
			if (archivio[i].getId() == id) 
                        {
				archivio[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public Vendita[] venditeCliente(String nome) 
        {
		Vendita[] result;
		int j = 0;
		
		for (int i = 0; i < NUM_FATTURE; i++) 
                {
                    if(archivio[i]!=null)
                    {
			if(!archivio[i].getCliente().getNome().equalsIgnoreCase(nome)) 
                        {
			} else {
                            j += 1;
                        }
                    }
                    else
                    {
                        System.out.println("Nessun cliente presente");
                    }
                }
		
		result = new Vendita[j];
		j=0;
		
		for (int i = 0; i < NUM_FATTURE; i++) 
                {
			if(archivio[i].getCliente().getNome().equalsIgnoreCase(nome))
                        {
				result[j] = archivio[i];
				j += 1;
			}
		}
		
		return result;
	}

   
    public String toString() 
    {
        String s="";
            for(int i =0;i<archivio.length;i++)
            {
                if(archivio[i]!=null)
                {
                    s=s+archivio[i].toString()+"\n";
                }
            }
        return s;
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
	
        public void esportaVendite(String filePathName) throws IOException, FileException
  {
      Vendita vendita ;
      TextFile f1= new TextFile(filePathName, 'W');
      for (int i=0;i<archivio.length;i++)
      {
          vendita=archivio[i];
          if(vendita!=null)
              {
                  f1.toFile(vendita.getId()+";"+vendita.getCliente()+";"+vendita.getTipoFarina()+";"+vendita.getQtaVenduta()+";"+vendita.getImporto());
              }
      }
      f1.close(); 
  }
	
        public Vendita[] elencoVenditeOrdinate() throws EccezionePosizioneNonValida
   {
       Vendita[] elencoVendite= new Vendita[getNumVendite()];
       Vendita v1;
       int c=0;
       
       for(int i=0;i<NUM_FATTURE;i++)
       {
               v1=getVendita(i);
               if(v1!=null)
               {
                  elencoVendite[c]=v1; 
                  c++;
 
           }
       }
       elencoVendite=Ordinatore.selectionSortVenditeCrescenti(elencoVendite);
       return elencoVendite;
   }
 
}
