/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jorch17
 */
public class ModelMenor {
    int n1=9;
    int n2=3;
    int n3=6;
    int m=9;
    
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
    public int getN2(){
        return n2;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    public int getN3(){
        return n3;
    }
    public void setN3(int n3){
        this.n3 = n3;
    }
    public int getM(){
        return m;
    }
    public void menor(){
        m = n1;
        if(n2<m){
            m = n2;
        }
        if(n3<m){
            m = n3;
        }
    }
}
