/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameadd;

import java.util.Scanner;

/**
 *
 * @author MAURYA
 */
public class GeneratString {
    
       int count;
       String gen;
       public void setValue(int a){
        int count =a;
        }
    
    public String Generate(int current){
        
        String exp = null;
    
        int trail=4;
            int correct = 0;
            int wrong = 0;
        Scanner in = new Scanner(System.in);
        
        while(true){
           
            int a= (int) (Math.random()*10+1);
            int b= (int) (Math.random()*10+1);
            System.out.print(a+"+"+b+"=");
            gen = Integer.toString(a)+" + "+Integer.toString(b);
            
            
            
           // int count = in.nextInt();
            if((a+b)==count)
            {
               System.out.print("Good\n");
               correct++;
            }
            else
            {
               System.out.print("poor\n");
               wrong++;
            }
           trail--;
           if(trail==0)
                   {
                       System.out.println("your no is "+correct*10);
                       System.out.println("correct Answer :"+correct);
                       System.out.println("wrong Answer :"+ wrong);
                       System.out.println("TotalQuestion"+(correct+wrong));
                       
                       break;
                   }
              // break;
             
           
         
    }
        return(gen);
        
        
    
    
   
    }   
}
    
