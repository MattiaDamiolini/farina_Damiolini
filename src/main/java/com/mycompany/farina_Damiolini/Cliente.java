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
	private String cognome;
	private String codiceFiscale;
	
	public Cliente(String nome, String cognome, String codiceFiscale) 
        {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
        
        public Cliente(Cliente c1)
        {
            this.nome=c1.getNome();
            this.cognome=c1.getCognome();
            this.codiceFiscale=c1.getCodiceFiscale();
        }
        
        public Cliente ()
   {
       nome = "";
       cognome = "";
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
	
	public String getCognome() 
        {
		return cognome;
	}

	public void setCognome(String cognome) 
        {
		this.cognome = cognome;
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
		s= "Cliente [nome ="+ nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
                return s;
	}
}

