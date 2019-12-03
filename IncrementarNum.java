/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;

import java.io.*;

/**
 *
 * @author Luiz Arthur
 */
public class IncrementarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File arq1 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "atualizarValores.txt");
        FileWriter a;
        
        File arq2 = new File("C:\\Users\\Luiz Arthur\\Desktop\\trabalhoPartico02", "diminuirValores.txt");
        FileWriter b;
        
        LeArquivo la = new LeArquivo();
        
        for(int i=0;i<1001;i++){
            la.LeValor(arq2,i);
            la.ReduzValor(arq1,i);
        }
//        la.Reduz();
    
}
}
