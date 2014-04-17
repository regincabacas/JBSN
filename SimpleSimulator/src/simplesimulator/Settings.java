/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplesimulator;

import java.util.Random;

/**
 *
 * @author Regin Cabacas
 */
public class Settings {
    
    //simulation variables
    public static int simulationTime;
    public static int nodeCount;
    public static int messageCount;
   
    //node state
    public static int interval;
    public static int dutyCycle;
      
    //energy variables
    public static double batteryCapacity;
    public static double initialEnergy;
    public static double transmitPower;
    public static double receivePower;
    public static double mcuActivePower;

    Random rng = new Random();

    public Settings(){
    
        this.simulationTime = 300;
        this.nodeCount = 5;
        this.messageCount = 200;
        
        this.interval = 1000;
        this.dutyCycle = 10;
        
        this.batteryCapacity = 1800.0;
        this.initialEnergy = 1800.0;
        this.transmitPower = .1;
        this.receivePower = .1;
        this.mcuActivePower = .01;
    }
    
    
}
