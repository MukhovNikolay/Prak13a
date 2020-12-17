package Prak12;

public class Variable implements CommonInterface{
    private String var;
    public Variable (String var){
        this.var = var;
    }
    public int evaluate(int x){
        return x;
    }
    public String toString(){
        return var;
    }

}
