package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Arrays.stream(args).forEach(System.out::println);
        System.out.println( "Hello World!" );
    }
}
