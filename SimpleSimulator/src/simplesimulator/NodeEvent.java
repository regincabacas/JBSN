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
public class NodeEvent implements Runnable{
    
    private int start;
    private String ID;
    SimTimeMonitor tm;
    
    public NodeEvent(int start, String id, SimTimeMonitor monitor)
    {
        this.start = start;
        this.ID = id;
        this.tm = monitor;
    
    }
    
    public void run()
    {
        boolean eventDone = false;
        while(!eventDone)
        {
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException e)
        {
            
        }
        if(tm.getTime() <= start)
        {
            
        System.out.println(ID);
        eventDone = true;
        }
       }
    }
    
}
