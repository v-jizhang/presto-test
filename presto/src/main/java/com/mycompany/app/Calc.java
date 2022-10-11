package com.mycompany.app;

public class Calc
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int substract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int mod(int a, int b)
    {
        return a % b;
    }
    
    public int divide(int a, int b)
    {
        return a / b;
    }

    public int abs(int a)
    {
        return a > 0? a: -a;
    }
}
