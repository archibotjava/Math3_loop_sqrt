package jv1;
//либры Java
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Jv1 {     
    
      void Jv1(int a){
          // Первое упражнение =) Вывести запись 10 раз на экран. Используем-с цикал)
          for (int i=0;i<=9;i++){
          System.out.println("Hello World! Ответ = "+Math.sqrt(a));
          //return;
          }
    }      
    public static void main(String[] args) {
      
      Jv1 test = new Jv1();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a");
      int k = in.nextInt();
      test.Jv1(k);
       
    }   
    
 }   

