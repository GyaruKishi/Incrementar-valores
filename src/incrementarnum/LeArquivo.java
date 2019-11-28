/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementarnum;
import java.io.*; 
import java.util.ArrayList;
import java.util.Iterator;


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

    //diminuir
    
    public int getRed1() {
        return red1;
    }

    public void setRed1(int red1) {
        this.red1 = red1;
    }

    public int getRed2() {
        return red2;
    }

    public void setRed2(int red2) {
        this.red2 = red2;
    }

    public int getRed3() {
        return red3;
    }

    public void setRed3(int red3) {
        this.red3 = red3;
    }
    
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
    
    
    
    public String Reduz(){
        setVis(this.vis-this.red1);
        setLik(this.lik-this.red2);
        setDis(this.dis-this.red3);
        String vr = Integer.toString(this.vis) + " " + Integer.toString(this.lik) + " " + Integer.toString(this.dis);
        System.out.println(vr);
        return vr;
    }
    
    public void LeValor(File arqD, int m){
        ArrayList<String> retarq = new ArrayList<>();
        String arm;
        int k=0;
        try{
            Reader file = new FileReader(arqD);
            BufferedReader in = new BufferedReader(file);
            String dimval = in.readLine();
            while ((dimval !=null)){
                if(k==m){
                    String[] numsep = dimval.split(" ");
                    setRed1(Integer.parseInt(numsep[0]));
                    setRed2(Integer.parseInt(numsep[1]));
                    setRed3(Integer.parseInt(numsep[2]));
                    arm =dimval;           
                    dimval = in.readLine();
                    retarq.add(k, arm);
                }else{
                    arm =dimval;           
                    dimval = in.readLine();
                    retarq.add(k, arm);
                    }
                k++;
            }
            file.close();
            in.close();
             }catch(IOException exc) {
                System.err.println("Erro");
            }
        System.out.println(getRed1());
        System.out.println(getRed2());
        System.out.println(getRed3());
    }
    
    public void ReduzValor(File arqV, int m){
        ArrayList<String> atarq = new ArrayList<>();
        String arm2;
        int l=0;
        try{
            Reader file = new FileReader(arqV);
            BufferedReader in = new BufferedReader(file);
            String atval = in.readLine();
            while ((atval !=null)){
                if(l==m){
                    String[] numsep = atval.split(" ");
                    setVis(Integer.parseInt(numsep[0]));
                    setLik(Integer.parseInt(numsep[1]));
                    setDis(Integer.parseInt(numsep[2]));
                    arm2 = atval;           
                    atval = in.readLine();
                    atarq.add(l, arm2);
                }else{
                    arm2 =atval;           
                    atval = in.readLine();
                    atarq.add(l, arm2);
                    }
                l++;
            }
            file.close();
            in.close();
             }catch(IOException exc) {
                System.err.println("Erro");
            }
//        System.out.println(getVis());
//        System.out.println(getLik());
//        System.out.println(getDis());
        int j=0;
//        int tam = atarq.size();
        try {
                FileWriter arq1 = new FileWriter(arqV);
                try (PrintWriter gravarArq = new PrintWriter(arq1)) {
                    while(j<1000){
                        if(j==m){
                            gravarArq.println(Reduz());
                            j++;
                        }else{
                            gravarArq.println(atarq.get(j));
                            j++;    
                        }
                    }
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    //6207 1301 2249

