package Prak12;

public class test{
    public static void main(String[] args){
        System.out.println(new Multiply(new Subtract(new Const(5),new Variable("x")),new Const(9)).ToString());
        System.out.println(new Multiply(new Subtract(new Const(5),new Variable("x")),new Const(9)).evaluate(7));
        System.out.println();
    }
}
