/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

/**
 *
 * @author Andreina
 */
public class Cliente 
{
        private String nome;
	private String nominativo;
	private String codiceFiscale;
	
	public Cliente(String nome, String nominativo, String codiceFiscale) 
        {
		this.nome = nome;
		this.nominativo = nominativo;
		this.codiceFiscale = codiceFiscale;
	}
        
        public Cliente(Cliente c1)
        {
            this.nome=c1.getNome();
            this.nominativo=c1.getNominativo();
            this.codiceFiscale=c1.getCodiceFiscale();
        }
        
        public Cliente ()
   {
       nome = "";
       nominativo = "";
       codiceFiscale = "";
   }
	
	public String getNome() 
        {
		return nome;
	}

	public void setNome(String nome) 
        {
		this.nome = nome;
	}
	
	public String getNominativo() 
        {
		return nominativo;
	}

	public void setNominativo(String nominativo) 
        {
		this.nominativo = nominativo;
	}

	public String getCodiceFiscale() 
        {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) 
        {
		this.codiceFiscale = codiceFiscale;
	}

	public String toString() 
        {
            String s;
		s= "Cliente [nome ="+ nome + ", nominativo=" + nominativo + ", codiceFiscale=" + codiceFiscale + "]";
                return s;
	}
}

