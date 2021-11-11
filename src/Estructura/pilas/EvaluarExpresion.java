/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura.pilas;

/**
 *
 * @author Francisco Javier
 */
public class EvaluarExpresion {
    private String infijo;

    public EvaluarExpresion(String infijo) {
        this.infijo = infijo;
    }
    private int prioridad(String op){
        switch(op){
            case"^": return 3;
            case"*":case"/":return 2;
            case"+":case"-":return 1;
            case"(":return 0;
            default:return -1;
        }
    }
    private double calculadora(String op, double b,double a){
        switch(op){
            case"+": return a+b;
            case"-":return a-b;
            case"*":return a*b;
            case"/":return a/b;
            default:return Math.pow(a, b);
            }
    }
    public String getPosfijo(){
        Pila pilita = new Pila();
        String post="";
        String operador ="+-*/^(";
        String operando="0123456789.";
        this.infijo=infijo.replace(" ", "");
        String exp[]=infijo.split("");
        for(int i= 0; i <exp.length; i++){
            if(operando.contains(exp[i])){
                while(i<exp.length && operando.contains(exp[i]) ){
                    post=post + exp[i];
                    i++;
                }
                i--;
                post = post+" ";
            }else if(operador.contains(exp[i])){
                if(pilita.isEmpty()|| exp[i].equals("(")){
                    pilita.push(exp[i]);
                }else{
                    while(!pilita.isEmpty() && prioridad(exp[i])<=prioridad((String)pilita.peek()) ){
                        post=post+pilita.pop();
                    }
                    pilita.push(exp[i]);
                }
            }else if(exp[i].equals(")")){
                while(!pilita.peek().equals("(")){
                    post=post+pilita.pop();
                }
                pilita.pop();
            }
        }
        while(!pilita.isEmpty()){
            post = post+pilita.pop();
        }
        return post;
    }
    public double getEvaluarPost(){
        String post = getPosfijo();
        String operador ="+-*/^";
        String operando="0123456789.";
        Pila pila= new Pila();
        String exp[]=post.split("");
        for(int i = 0; i < exp.length; i++){
            String valor ="";
            if(operando.contains(exp[i])){
                while(operando.contains(exp[i])){
                    valor = valor+exp[i];
                    i++;
                }
            pila.push(Double.parseDouble(valor));
            }else if(operador.contains(exp[i])){
                double b=(double)pila.pop();
                double a=(double)pila.pop();
                double z=calculadora(exp[i],b,a);
                pila.push(z);
            }
        }
        return (double)pila.pop();
    }
}
