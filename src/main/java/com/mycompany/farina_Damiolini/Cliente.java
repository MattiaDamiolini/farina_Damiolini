/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

/**
 *questa classe rappresenta un cliente. i suoi attributi sono:
 * nome <br>
 * cognome <br>
 * codiceFiscale <br>
 * 
 * @author Andreina
 */
public class Cliente 
{
        private String nome;
	private String cognome;
	private String codiceFiscale;
	/**
         * Costruttore della classe cliente. Consente di istanziare un cliente
         * @param nome nome del cliente
         * @param cognome cognome del cliente
         * @param codiceFiscale codice fiscale del cliente
         */
	public Cliente(String nome, String cognome, String codiceFiscale) 
        {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
        /**
         * Costruttore di copia della classe cliente
         * @param c1 Cliente 1, di cui viene creata una copia
         */
        public Cliente(Cliente c1)
        {
            this.nome=c1.getNome();
            this.cognome=c1.getCognome();
            this.codiceFiscale=c1.getCodiceFiscale();
        }
        /**
         * Costruttore di default della classer cliente. <br>
         * Assegna ad ogni parametro un valore di default: <br>
         * alle stringhe, una stringa vuota, agli interi 0
         */
        public Cliente ()
   {
       nome = "";
       cognome = "";
       codiceFiscale = "";
   }
	/**
         * get del nome
         * @return valore del nome
         */
	public String getNome() 
        {
		return nome;
	}
        /**
         * set del nome
         * @param nome valore del nome
         */
	public void setNome(String nome) 
        {
		this.nome = nome;
	}
	
        /**
         * get del cognome
         * @return valore del cognome
         */
	public String getCognome() 
        {
		return cognome;
	}
        
        /**
         * set del cognome
         * @param cognome valore del cognome
         */
	public void setCognome(String cognome) 
        {
		this.cognome = cognome;
	}
        
        /**
         * get del codice fiscale
         * @return valore del codice fiscale
         */
	public String getCodiceFiscale() 
        {
		return codiceFiscale;
	}
        
        /**
         * set del codice fiscale
         * @param codiceFiscale valore del codice fiscale
         */
	public void setCodiceFiscale(String codiceFiscale) 
        {
		this.codiceFiscale = codiceFiscale;
	}
        
        /**
         * toString della classe cliente
         * @return stringa
         */
	public String toString() 
        {
            String s;
		s= "Cliente [nome ="+ nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
                return s;
	}
}

