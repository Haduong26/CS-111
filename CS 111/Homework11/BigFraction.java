package Homework11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class BigFraction {
    // public final BigFraction ONE;
    // public final BigFraction ZERO; 

    public BigInteger num;
    public BigInteger denom;

    public static void main(String[] args) {
        BigFraction A = new BigFraction(1, 2);
        BigFraction B = new BigFraction("2/4");
        BigFraction C = A.multiply​(B);
        System.out.print(C.toString());
    }

    private void Simplify(){
        BigInteger gcd = num.gcd(denom);
        num = num.divide(gcd);
        denom = denom.divide(gcd);
    }

    public BigFraction(BigInteger numerator, BigInteger denominator) {
        num = numerator;
        denom = denominator;
        this.Simplify();
    }

    public BigFraction(long numerator, long denominator){
        num = BigInteger.valueOf(numerator);
        denom = BigInteger.valueOf(denominator);
        this.Simplify();
    }

    public BigFraction(BigFraction f) {
        num = f.num;
        denom= f.denom;
    }

    public BigFraction(java.lang.String s){
        String temp = new String("");
        boolean flag = true;
        s = s + "/";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '/') {
                if (flag == true) {
                    num = new BigInteger(temp);
                }
                else{
                    denom = new BigInteger(temp);
                }
                flag = false;
                temp = "";
            }
            else{
                temp = temp + s.charAt(i);
            }
        }
    }

    public java.math.BigInteger getNum(){
        return num;
    }

    public java.math.BigInteger getDen(){
        return denom;
    }
    public java.lang.String toString(){
        String frac = new String(num + "/" + denom);
        return frac;
    }

    public java.math.BigDecimal asBigDecimal​(int scale, java.math.RoundingMode roundingMode){
        BigDecimal decnum = new BigDecimal(num);
        BigDecimal decdenom = new BigDecimal(denom);
        return decnum.divide(decdenom,scale,roundingMode);
    }

    public BigFraction negate(){
        num = num.negate();
        BigFraction negfrac = new BigFraction(num,denom);
        return negfrac;
    }

    public BigFraction add​(BigFraction b){
        return new BigFraction(num.multiply(b.denom).add(denom.multiply(b.num)), denom.multiply(b.denom));   
    }

    public BigFraction subtract​(BigFraction b){
        return new BigFraction(num.multiply(b.denom).subtract(denom.multiply(b.num)), denom.multiply(b.denom));   

    }

    public BigFraction multiply​(BigFraction b){
        BigFraction result = new BigFraction(num.multiply(b.num), denom.multiply(b.denom));   
        result.Simplify();
        return result;

    }

    public BigFraction divide​(BigFraction b){
        return new BigFraction(num.multiply(b.denom), denom.multiply(b.num));   

    }





    }


