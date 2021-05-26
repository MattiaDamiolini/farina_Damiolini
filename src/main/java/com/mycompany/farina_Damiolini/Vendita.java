/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

import java.io.Serializable;

/**
 *questa classe rappresenta una vendita. I suoi attributi sono:
 * id <br>
 * cliente <br>
 * tipoFarina <br> 
 * qtaVenduta <br>
 * importo <br>
 * 
 * @author Andreina
 */
public class Vendita implements Serializable 
{
	private int id;
	private Cliente cliente;
	private int tipoFarina;
	private double qtaVenduta;
	private double importo;
	/**
         * costruttore della classe vendita.Consente di istanziare una nuova vendita.
         * @param cliente cliente della vendita 
         * @param tipoFarina tipo di farina
         * @param qtaVenduta quantità di farinas venduta
         */
	public Vendita(Cliente cliente, int tipoFarina, double qtaVenduta) 
        {
		this.cliente = cliente;
		this.tipoFarina = tipoFarina;
		this.qtaVenduta = qtaVenduta;
		this.importo = importo;
	}
        /**
         * costruttore di copia della classe vendita
         * @param v vendita v, di cui vierne creata una copia
         */
        public Vendita(Vendita v)
        {
            this.cliente = v.getCliente();                  
            this.tipoFarina = v.getTipoFarina();
            this.qtaVenduta = v.getQtaVenduta();
            this.importo = v.getImporto();
            
        }
        
        /**
         * costruttore di default della classe vendita. <br>
         * Assegna ad ogni parametro un valore di default:<br>
         * alle stringe, una stringa vuota, agli interi 0.
         */
        public Vendita()
        {
            id=0;
            cliente=cliente;
            tipoFarina=0;
            qtaVenduta=0;
            importo=0;
          
        }
        
        /**
         * get dell'id
         * @return il valore di id
         */
	public int getId() 
        {
		return id;
	}
        
        /**
         * set dell'id
         * @param id il valore di id
         */
	public void setId(int id) 
        {
		this.id = id;
	}
        
        /**
         * get del cliente
         * @return il valore di cliente
         */
	public Cliente getCliente()
        {
		return cliente;
	}
        
        /**
         * set del cliente
         * @param cliente il valore del cliente
         */
	public void setCliente(Cliente cliente) 
        {
		this.cliente = cliente;
	}
        
        /**
         * get del tipo di farina
         * @return tipo di farina
         */
	public int getTipoFarina()
        {
		return tipoFarina;
	}
        
        /**
         * set del tipo di farina
         * @param tipoFarina valore del tipo di farina
         */
	public void setTipoFarina(int tipoFarina) 
        {
		this.tipoFarina = tipoFarina;
	}
        
        /**
         * get della quantità di farina venduta
         * @return quantità di farina venduta
         */
	public double getQtaVenduta()
        {
		return qtaVenduta;
	}
        
        /**
         * set della quantità venduta
         * @param qtaVenduta valore della quantità venduta
         */
	public void setQtaVenduta(double qtaVenduta) 
        {
		this.qtaVenduta = qtaVenduta;
                setImporto();
	}
        
        /**
         * get dell'importo
         * @return valore dell'importo
         */
	public double getImporto()
        {
		return importo;
	}
        
        /**
         * set dell'importo
         */
	public void setImporto()
        {
                switch(tipoFarina)
                {
                    case 0:
                    {
                        importo= getQtaVenduta()*1.5;
                        break;
                    }
                    case 1:
                    {
                        importo=getQtaVenduta()*2;
                        break;
                    }
                    case 2:
                    {
                        importo=getQtaVenduta()*2.5;
                        break;
                    }
                    case 3:
                    {
                        importo=getQtaVenduta()*4.5;
                        break;
                    }
                }
	}

	
        
        /**
         * toString della classe vendita
         * @return stringa completa
         */
	public String toString() 
        {
            String s;
            
		s= "Vendita [id=" + id + ", tipoFarina=" + tipoFarina
				+ ", qtaVenduta=" + qtaVenduta + ", importo=" + importo +"]";
                 return s;
	}
		
    
}
