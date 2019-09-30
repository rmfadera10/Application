package com.mahesh.gridapplication.arithmetic;

public class Arithmetic {
    private double var1, var2;

//    public Arithmetic(double var1, double var2) {
//        this.var1 = var1;
//        this.var2 = var2;
//    }
    public double addiction(){
        return  (var1 + var2);
    }
    public double subtraction(){
        return  (var1 - var2);
    }

    public double divide(){
        return  (var1 / var2);
    }
    public double multiplicaton(){
        return  (var1 * var2);
    }
    public double remainder(){
        return  (var1 % var2);
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }
}
