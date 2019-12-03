/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;

import java.io.*;
import java.util.*;
/**
 *
 * @author Luiz Arthur
 */
public class IncrementarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File arq1 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "diminuirValores.txt");
        File arq2 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "atualizarValores.txt");
        
        LeArquivo la = new LeArquivo();
        
        int o=la.VerTam(arq1);
        //vetores para armazenar os valores dos arquivos
        int Vis[]= new int[o];
        int Lik[]= new int[o];
        int Dis[]= new int[o];
        int DVis[]= new int[o];
        int DLik[]= new int[o];
        int DDis[]= new int[o];
        //arraylist para receber as strings para converter para int
        ArrayList<String> atval= new ArrayList<>();
        atval =la.LeValor(arq2,o);
        String parte;
        
        //for para valores do arquivo atualizarValores 
        for(int i=0;i<o;i++){
            parte = atval.get(i);
            String[] numsep = parte.split(" ");
            Vis[i]=Integer.parseInt(numsep[0]);
            Lik[i]=Integer.parseInt(numsep[1]);
            Dis[i]=Integer.parseInt(numsep[2]);
//            System.out.println(Vis[i]);
//            System.out.println(Lik[i]);
//            System.out.println(Dis[i]);
        }
        
        atval =la.LeValor(arq1,o);
        //for para valores do arquivo diminuir Valores
        for(int i=0;i<o;i++){
            parte = atval.get(i);
            String[] numsep = parte.split(" ");
            DVis[i]=Integer.parseInt(numsep[0]);
            DLik[i]=Integer.parseInt(numsep[1]);
            DDis[i]=Integer.parseInt(numsep[2]);  
//            System.out.println(DVis[i]);
//            System.out.println(DLik[i]);
//            System.out.println(DDis[i]);
        }
        
        //decleração de threads
        ThreadIn tr= new ThreadIn("Thread 1",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr2= new ThreadIn("Thread 2",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr3= new ThreadIn("Thread 3",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr4= new ThreadIn("Thread 4",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr5= new ThreadIn("Thread 5",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr6= new ThreadIn("Thread 6",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr7= new ThreadIn("Thread 7",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr8= new ThreadIn("Thread 8",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr9= new ThreadIn("Thread 9",Vis,DVis,Lik,DLik,Dis,DDis);
        ThreadIn tr10= new ThreadIn("Thread 10",Vis,DVis,Lik,DLik,Dis,DDis);
        
 
                     
}
}
