/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplesimulator;

/**
 *
 * @author Regin Cabacas
 */
public class SimClock extends Thread implements SimTimeMonitor{
    
    private int endTime;
    
    public SimClock(int et)
    {
        this.endTime = et;
    }
     public void run()
    {
        for(int t = 0 ; t <= endTime; t++)
        {
            System.out.println("T minus " + t );
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
     public int getTime()
     {
        return endTime; 
     }
    
    
}
