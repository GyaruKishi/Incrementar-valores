/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz Arthur
 */
public class ThreadIn extends Thread{
        
    //variáveis 
    private String  nome;
    static private File arq1 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "diminuirValores.txt");
    private File arq2 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "atualizarValores.txt");
    private static volatile int m;
    private volatile boolean b=true;
    static LeArquivo la = new LeArquivo();
    static final int n = la.VerTam(arq1);
    
    //vetores para receber os vetores da main
    private static int V[]= new int[n];
    private static int L[]= new int[n];
    private static int D[]= new int[n];
    private static int DV[]= new int[n];
    private static int DL[]= new int[n];
    private static int DD[]= new int[n];
    private static String sa;
    private int tempo;
    
    //construtor
    public ThreadIn(String nome,int V[],int L[],int D[],int DV[],int DL[],int DD[]) {
        this.nome=nome;
        ThreadIn.V=V;
        ThreadIn.L=L;
        ThreadIn.D=D;
        ThreadIn.DV=DV;
        ThreadIn.DL=DL;
        ThreadIn.DD=DD;
        start();
    }
    
    //
    public void run(){
        while(m!=n){
            synchronized(la){
                    System.out.println(m + "numero");
                    System.out.println(nome);
                    sa=la.Reduz(n,V[m],L[m],D[m],DV[m],DL[m],DD[m]);
                    m++;
                }
            PrintaValAt();
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
    
    //método para printar o vetor com o resultado das reduções de valores
    public void PrintaValAt(){
        synchronized(sa){
            System.out.println(sa);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
