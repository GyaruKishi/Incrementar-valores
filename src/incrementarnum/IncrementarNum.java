/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
        
        la.LeValor(arq2);
        la.ReduzValor(arq2, arq1);
        la.Reduz();
        //Pega os itens do arquivo e passa pro Arraylist
//        ArrayList<String> retarq = new ArrayList<>();
//        String arm;
//        Scanner s=new Scanner(System.in);
//        String n,m;
//        int k=0;
//        try{
//            Reader file = new FileReader(arq2);
//            BufferedReader in = new BufferedReader(file);
//            String dimval = in.readLine();
//            while ((dimval !=null)){
//                arm =dimval;           
//                dimval = in.readLine();
//                retarq.add(k, arm);
//                k++;
//            }
//            file.close();
//            in.close();
//             }catch(IOException exc) {
//                System.err.println("Erro");
//            }
//
//    //Passa o novo membro pro Arraylist
//        int j=0;
//        Iterator t =espor.iterator();
//        while(t.hasNext()){
//            Esporte p = (Esporte)t.next();
//            if(espo.getMat().equals(p.getMat())){
//                v=1;
//             break;
//            }
//        }
//        if(v==1){
//            return "Este praticante já está cadastrado nesta atividade";
//        }else{
//        espor.add(espo);
//
//    //Retorna o Arraylist com o novo membro pro Arqivo
//        int i=0;
//        int tam = espor.size();
//        try {
//            FileWriter arq1 = new FileWriter(arq);
//            try (PrintWriter gravarArq = new PrintWriter(arq1)) {
//                while(i<tam){
//                gravarArq.println(espor.get(i).getNome());
//                gravarArq.println(espor.get(i).getMat());
//                i++;
//                }
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        return "";
//        }
//    }
//    }
    
}
}
