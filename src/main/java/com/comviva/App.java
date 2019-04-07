package com.comviva;

import com.comviva.file.FileProcess; 
import com.comviva.exception.FileProcessException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileProcessException
    {
        FileProcess fp = new FileProcess();
		System.out.println("The sum of all numbers are : " + fp.sumAllNumbers(args[0]));
    }
}
