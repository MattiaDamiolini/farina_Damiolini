
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENTE
 */
public class Ordinazioni implements Serializable
{
    //attributi
    private Farina[] ordinazioni;
    private static int NUM_MAX_FARINA=100;
    
    public Ordinazioni()
    {
        ordinazioni=new Farina[NUM_MAX_FARINA];
    }
    
    public static int getNumMaxOrdinazioni()
    {
        return NUM_MAX_FARINA;
    }

    public Farina[] getOrdinazioni() 
    {
        return ordinazioni;
    }

    public void setOrdinazioni(Farina[] ordinazioni) 
    {
        this.ordinazioni = ordinazioni;
    }

    public static void setNUM_MAX_FARINA(int NUM_MAX_FARINA) 
    {
        Ordinazioni.NUM_MAX_FARINA = NUM_MAX_FARINA;
    }
    
}
