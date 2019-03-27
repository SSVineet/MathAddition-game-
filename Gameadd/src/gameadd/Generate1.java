/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameadd;

/**
 *
 * @author MAURYA
 */
public class Generate1 {
    int count =10;
    int score =0 ;
    int correct =0;
    int wrong=0;
    int status=0;  
    int current=0; // get here text value
    String exp;
    HOME obj = new HOME();
    
    public String Mainfunction( int k )
    { 
        while(count>0)
        {
        
        int current = k;
        int a= (int) (Math.random()*10+1);
        int b= (int) (Math.random()*10+1);
         exp = Integer.toString(a)+" + "+Integer.toString(b);
       
        if((a+b)==current)
        {
          correct++;
        }
        else
        {
          wrong++;
        }
        count--;
        }
        
        
       
       
     return(exp);
    }
    public void corrent(int a ){
            current =a;
    }
    public int getScore()
    {
        return score;
    }
    public int getCorrect()
    {
        return correct;
    }
    public int getWrong()
    {
         return(wrong);
    }
    public int getStatus()
    {
        return(status);
    }

    void current(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
