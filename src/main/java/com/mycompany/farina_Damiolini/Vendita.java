/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

import eccezioni.EccezionePosizioneNonValida;
import java.io.Serializable;
import java.time.LocalDate;

/**
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
	
	public Vendita(Cliente cliente, int tipoFarina, double qtaVenduta) 
        {
		this.cliente = cliente;
		this.tipoFarina = tipoFarina;
		this.qtaVenduta = qtaVenduta;
		this.importo = importo;
	}
        public Vendita(Vendita v)
        {
            this.cliente = v.getCliente();                  
            this.tipoFarina = v.getTipoFarina();
            this.qtaVenduta = v.getQtaVenduta();
            this.importo = v.getImporto();
            
        }
        
        public Vendita()
        {
            id=0;
            cliente=cliente;
            tipoFarina=0;
            qtaVenduta=0;
            importo=0;
          
        }

	public int getId() 
        {
		return id;
	}

	public void setId(int id) 
        {
		this.id = id;
	}

	public Cliente getCliente()
        {
		return cliente;
	}

	public void setCliente(Cliente cliente) 
        {
		this.cliente = cliente;
	}

	public int getTipoFarina()
        {
		return tipoFarina;
	}

	public void setTipoFarina(int tipoFarina) 
        {
		this.tipoFarina = tipoFarina;
	}

	public double getQtaVenduta()
        {
		return qtaVenduta;
	}

	public void setQtaVenduta(double qtaVenduta) 
        {
		this.qtaVenduta = qtaVenduta;
                setImporto();
	}

	public double getImporto()
        {
		return importo;
	}

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

	

	public String toString() 
        {
            String s;
            
		s= "Vendita [id=" + id + ", tipoFarina=" + tipoFarina
				+ ", qtaVenduta=" + qtaVenduta + ", importo=" + importo +"]";
                 return s;
	}
		
    
}
