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

/**
 *questa classe rappresenta un archivio. I suoi attributi sono:
 * id <br>
 * archivio <br>
 * cliente <br>
 * NUM_FATTURE
 * @author Andreina
 */
public class Archivio 
{
    private int id = 0;
	private Vendita[] archivio;
        Cliente cliente = new Cliente();
	private static final int NUM_FATTURE = 100;
	
        /** 
         * costruttore della classe archivio. Consente di stanziare un nuovoi archivio
         */
	public Archivio() 
        {
		archivio = new Vendita[NUM_FATTURE];
	}
        
        /**
         * get di una vendita.
         * @param posizione posizione dell'archivio alla vendita
         * @return vendita || null
         */
        public Vendita getVendita(int posizione)
        {
            if(archivio[posizione]!=null)
            {
                return new Vendita(archivio[posizione]);
            }
        return null;
        }
        
        /**
         * get di tutte le vendite
         * @return numero vendite
         * @throws EccezionePosizioneNonValida se posizione non valida
         */
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
            /**
             * permette di registrare una vendita
             * @param vendita vendita da registrare
             */
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
	
        /**
         * permette di eliminare una vendita
         * @param id parametro con il quale avviene l'eliminazione
         * @return vendita eliminata
         */
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
	
        /**
         * consente di visualizzare le vendite di un cliente
         * @param nome parametro con il quale avviene la visualizzazione
         * @return result
         */
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

   /**
    * permette di visualizzare una stringa dove sono inserite tutte le vendite
    * @return stringa
    */
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
        
	
        /**
         * consente di salvare le vendite su un file
         * @param nomeFile nome del file sul quale salvare le vendite
         * @throws IOException 
         */
	public void salvaVendite(String nomeFile) throws IOException
	{
		FileOutputStream file=new FileOutputStream(nomeFile);
		ObjectOutputStream writer=new ObjectOutputStream(file);
		
		writer.writeObject(archivio);
		writer.flush();
		file.close();
	}
	/**
         * consente di caricare il file salvato
         * @param nomeFile nome del file da cui vengono caricati i dati
         * @return dati dentro il file
         * @throws IOException
         * @throws ClassNotFoundException 
         */
	public Vendita[] caricaVendite(String nomeFile) throws IOException, ClassNotFoundException
	{
		FileInputStream file=new FileInputStream(nomeFile);
		ObjectInputStream reader= new ObjectInputStream(file);
		
		Vendita[] v;
		v = (Vendita[])reader.readObject();
		
		file.close();
		return v;
	}
	
        /**
         * consente di esportare i dati su un file CSV
         * @param filePathName nome del file su cui esportare i dati
         * @throws IOException
         * @throws FileException 
         */
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
	/**
         * consente di visualizzare le vendite oirdinate in base all'importo da pagare
         * @return elenco delle vendite ordinate
         * @throws EccezionePosizioneNonValida 
         */
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
