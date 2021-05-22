
import java.time.LocalDateTime;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENTE
 */
public class Farina 
{
    private int codice;
    private String nome;
    private String nominativo;
    private String codiceF;
    private String tipoFarina;
    private double quantità;
    private double importo;
    private LocalDateTime dataVendita;
    private LocalDateTime dataSaldo;

    public Farina(int codice, String nome, String nominativo, String codiceF, String tipoFarina, double quantità, double importo, LocalDateTime dataVendita, LocalDateTime dataSaldo) {
        this.codice = codice;
        this.nome = nome;
        this.nominativo = nominativo;
        this.codiceF = codiceF;
        this.tipoFarina = tipoFarina;
        this.quantità = quantità;
        this.importo = importo;
        this.dataVendita = dataVendita;
        this.dataSaldo = dataSaldo;
    }
    public Farina() 
    {
        this.codice = 0;
        this.nome ="";
        this.nominativo = "";
        this.codiceF = "";
        this.tipoFarina = "";
        this.quantità = 0;
        this.importo = 0;
        this.dataVendita = LocalDateTime.now();
        this.dataSaldo = LocalDateTime.of(2002, Month.MARCH, 15, 12, 50);
    }
    
    public Farina(Farina f1)
    {
        this.codice=f1.getCodice();
        this.nome=f1.getNome();
        this.nominativo=f1.getNominativo();
        this.codiceF=f1.getCodiceF();
        this.tipoFarina=f1.getTipoFarina();
        this.quantità=f1.getQuantità();
        this.importo=f1.getImporto();
        this.dataVendita=f1.getDataVendita();
        this.dataSaldo=f1.getDataSaldo();
    }
    public int getCodice() 
    {
        return codice;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getNominativo() 
    {
        return nominativo;
    }

    public String getCodiceF() 
    {
        return codiceF;
    }

    public String getTipoFarina() 
    {
        return tipoFarina;
    }

    public double getQuantità() 
    {
        return quantità;
    }

    public double getImporto() 
    {
        return importo;
    }

    public LocalDateTime getDataVendita() 
    {
        return dataVendita;
    }

    public LocalDateTime getDataSaldo() 
    {
        return dataSaldo;
    }

    public void setCodice(int codice) 
    {
        this.codice = codice;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setNominativo(String nominativo) 
    {
        this.nominativo = nominativo;
    }

    public void setCodiceF(String codiceF) 
    {
        this.codiceF = codiceF;
    }

    public void setTipoFarina(String tipoFarina) 
    {
        this.tipoFarina = tipoFarina;
    }

    public void setQuantità(double quantità) 
    {
        this.quantità = quantità;
    }

    public void setImporto(double importo) 
    {
        this.importo = importo;
    }

    public void setDataVendita(LocalDateTime dataVendita) 
    {
        this.dataVendita = dataVendita;
    }

    public void setDataSaldo(LocalDateTime dataSaldo) 
    {
        this.dataSaldo = dataSaldo;
    }
    
    public String toString()
    {
        String s;
        s=getCodice()+";"+getNome()+";"+getNominativo()+";"+getCodiceF()+";"+getTipoFarina()+";"+getQuantità()+";"+getImporto()+";"+getDataVendita()+";"+getDataSaldo()+";";
        return s;
    }
    
}
