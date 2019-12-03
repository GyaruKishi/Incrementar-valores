/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;
import java.io.*; 
import java.util.ArrayList;


/**
 *
 * @author Luiz Arthur
 */
public class LeArquivo {
    
    private int red1;
    private int red2;
    private int red3;
    
    private int vis;
    private int lik;
    private int dis;

    //atualizar

    public int getVis() {
        return vis;
    }

    public void setVis(int vis) {
        this.vis = vis;
    }

    public int getLik() {
        return lik;
    }

    public void setLik(int lik) {
        this.lik = lik;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }
    
    //com a sua ideia para atualizar o código eu consegui reduzir os métodos necessários
    
    //este realiza a redução dos valores
    public String Reduz(int m,int vis, int red1, int lik,int red2, int dis, int red3){
        setVis(vis-red1);
        setLik(lik-red2);
        setDis(dis-red3);
        String vr = Integer.toString(this.vis) + " " + Integer.toString(this.lik) + " " + Integer.toString(this.dis);
        return vr;
    }
    
    //este faz a leitura dos arquivos e os retorna como arraylist
    public ArrayList<String> LeValor(File arqD, int n){
        ArrayList<String> retarq = new ArrayList<>();
        String arm;
        int k=0;
        try{
            Reader file = new FileReader(arqD);
            BufferedReader in = new BufferedReader(file);
            String dimval = in.readLine();
            while ((dimval !=null)){
                    arm =dimval;           
                    dimval = in.readLine();
                    retarq.add(k, arm);
                k++;
            }
            file.close();
            in.close();
             }catch(IOException exc) {
                System.err.println("Erro");
            }
        return(retarq);
//        System.out.println(getRed1());
//        System.out.println(getRed2());
//        System.out.println(getRed3());
        
    }
    
    //e este por último verifica a quantidade de linhas do arquivo para fazer as verificações ao longo do código
    public int VerTam(File arq){
        String arm;
        int k=0;
        try{
            Reader file = new FileReader(arq);
            BufferedReader in = new BufferedReader(file);
            String dimval = in.readLine();
            while ((dimval !=null)){
                arm =dimval;           
                dimval = in.readLine();
                k++;
            }
            file.close();
            in.close();
             }catch(IOException exc) {
                System.err.println("Erro");
            }
        return k;
    }
}

