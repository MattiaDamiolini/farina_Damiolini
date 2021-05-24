/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

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
	private String tipoFarina;
	private double qtaVenduta;
	private double importo;
	private LocalDate dataVendita;
	private LocalDate dataSaldo = null;
	
	public Vendita(Cliente cliente, String tipoFarina, double qtaVenduta, double importo, LocalDate dataVendita, LocalDate dataSaldo) 
        {
		this.cliente = cliente;
		this.tipoFarina = tipoFarina;
		this.qtaVenduta = qtaVenduta;
		this.importo = importo;
		this.dataVendita = dataVendita;
		this.dataSaldo = dataSaldo;
	}
        public Vendita(Vendita v)
        {
            this.cliente = v.getCliente();                  
            this.tipoFarina = v.getTipoFarina();
            this.qtaVenduta = v.getQtaVenduta();
            this.importo = v.getImporto();
            this.dataVendita = v.getDataVendita();
            this.dataSaldo = v.getDataSaldo();
        }
        
        public Vendita()
        {
            id=0;
            cliente=cliente;
            tipoFarina="";
            qtaVenduta=0;
            importo=0;
            dataVendita=LocalDate.now();
            dataSaldo=LocalDate.now();
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

	public String getTipoFarina()
        {
		return tipoFarina;
	}

	public void setTipoFarina(String tipoFarina) 
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
	}

	public double getImporto()
        {
		return importo;
	}

	public double setImporto(double importo)
        {
                this.importo=importo;
            return 0;
	}

	public LocalDate getDataVendita()
        {
		return dataVendita;
	}

	public String setDataVendita(LocalDate dataVendita) 
        {
		this.dataVendita = dataVendita;
            return null;
	}

	public LocalDate getDataSaldo() 
        {
		return dataSaldo;
	}

	public String setDataSaldo(LocalDate dataSaldo)
        {
		this.dataSaldo = dataSaldo;
            return null;
	}

	public String toString() 
        {
            String s;
            
		s= "Vendita [id=" + id + ", cliente=" + cliente + ", tipoFarina=" + tipoFarina
				+ ", qtaVenduta=" + qtaVenduta + ", importo=" + importo + ", dataVendita=" + dataVendita
				+ ", dataSaldo=" + dataSaldo + "]";
                 return s;
	}
		

}
