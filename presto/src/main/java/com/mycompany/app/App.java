package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean sayHi()
    {
        System.out.println("Hi!");
	return true;
    }

    public static void main( String[] args )
    {
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("Hello World!");
    }
}
