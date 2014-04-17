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
public class CoordinatorNode {
    
    private static int [] priorityNumbersToCompare = new int[Settings.nodeCount];
    
    public void runNode()
    {
        boolean sleep = true; boolean  active= false;
        int csleep = 0; int cactive = 0;
        int cycle = Settings.interval * 60; //in minutes
        int dutyCycle = Settings.dutyCycle; //percent
        
        int sleepCycle = 100 - dutyCycle;
        int timeToSleep = (int)(cycle * (sleepCycle * 0.01));
        int timeActive = (int) (cycle * (dutyCycle * 0.01));
        
        //node state loop
        for(int i = 0; i < Settings.simulationTime; i++)
        {
            if(sleep)
            {
                if(csleep < timeToSleep)
                {
                    //Sleep(i);
                    csleep++;
                }
                else
                {
                    sleep = false;
                    csleep = 0;
                    active = true;
                }
            }
            
            if(active)
            {
                if(cactive < timeActive)
                {
                    //Active(i);
                    cactive++;
                }
                else
                {
                    active = false;
                    cactive = 0;
                    sleep = true;
                }
            }
        }
        
//        public CoordinatorNode()
//        {
//            for(int i = 0; i < Settings.nodeCount; i++)
//            {
//                priorityNumbersToCompare[i] = new Integer();
//            }
//        }
        
        
    }
    
}
