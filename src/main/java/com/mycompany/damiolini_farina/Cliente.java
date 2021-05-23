/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.damiolini_farina;

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
		return "Cliente [nome ="+ nome + ", nominativo=" + nominativo + ", codiceFiscale=" + codiceFiscale + "]";
	}
}

