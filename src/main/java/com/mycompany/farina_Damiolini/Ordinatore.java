/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farina_Damiolini;

/**
 *
 * @author DamioliniMattia
 */
public class Ordinatore
{

    public static void scambia(Vendita v[],int posizione1,int posizione2)
    {
        Vendita c;
        c=v[posizione1];
        v[posizione1]=v[posizione2];
        v[posizione2]=c;
    }
    /*public static int[] selectionSortCrescente(int[] a)
    {
        int[] ordinato=new int[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-2;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j]<ordinato[i])
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
    
    public static int[] selectionSortDecrescente(int[] a)
    {
        int[] ordinato=new int[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-2;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j]>ordinato[i])
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
    
    public static String[] selectionSortCrescente(String[] a)
    {
        String[] ordinato=new String[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-2;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j].compareToIgnoreCase(ordinato[i])<0)
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
    
    public static String[] selectionSortDecrescente(String[] a)
    {
        String[] ordinato=new String[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-2;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j].compareToIgnoreCase(ordinato[i])>0)
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }*/
    
    public static Vendita[] selectionSortVenditeCrescenti(Vendita[] a)
    {
        Vendita[] ordinato=new Vendita[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-1;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j].getImporto()<ordinato[i].getImporto())
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
    
   /* public static Libro[] selectionSortAfabeticoAutoreTitolo(Libro[] a)
    {
        Libro[] ordinato=new Libro[a.length];
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        for(int i=0;i<=ordinato.length-1;i++)
        {
            for(int j=i+1;j<ordinato.length;j++)
            {
                if(ordinato[j].getAutore().compareToIgnoreCase(ordinato[i].getAutore())<0 || (ordinato[j].getAutore().compareToIgnoreCase(ordinato[i].getAutore())==0  && ordinato[j].getTitolo().compareToIgnoreCase(ordinato[i].getTitolo())<0))
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
    
    public static int[] bubbleSortCrescente(int a[])
    {
        int[] ordinato=new int[a.length];
        boolean scambioAvvenuto=false;
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<ordinato.length-1;i++)
            {
                if(ordinato[i]>ordinato[i+1])
                {
                    scambia(ordinato,i,i+1);
                    scambioAvvenuto=true;
                }
            }
        }while(scambioAvvenuto);
        
        return ordinato;
    }
    
    public static int[] bubbleSortDecrescente(int a[])
    {
        int[] ordinato=new int[a.length];
        boolean scambioAvvenuto=false;
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<ordinato.length-1;i++)
            {
                if(ordinato[i]<ordinato[i+1])
                {
                    scambia(ordinato,i,i+1);
                    scambioAvvenuto=true;
                }
            }
        }while(scambioAvvenuto);
        
        return ordinato;
    }
    
    public static String[] bubbleSortCrescente(String a[])
    {
        String[] ordinato=new String[a.length];
        boolean scambioAvvenuto=false;
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<ordinato.length-1;i++)
            {
                if(ordinato[i].compareToIgnoreCase(ordinato[i+1])>0)
                {
                    scambia(ordinato,i,i+1);
                    scambioAvvenuto=true;
                }
            }
        }while(scambioAvvenuto);
        
        return ordinato;
    }
    
    public static String[] bubbleSortDecrescente(String a[])
    {
        String[] ordinato=new String[a.length];
        boolean scambioAvvenuto=false;
        
        for(int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        
        do
        {
            scambioAvvenuto=false;
            for(int i=0;i<ordinato.length-1;i++)
            {
                if(ordinato[i].compareToIgnoreCase(ordinato[i+1])<0)
                {
                    scambia(ordinato,i,i+1);
                    scambioAvvenuto=true;
                }
            }
        }while(scambioAvvenuto);
        
        return ordinato;
    }*/
}
