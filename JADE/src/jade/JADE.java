/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jade;

/**
 *
 * @author AFRIZAL
 */

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
public class JADE extends Agent {
    
    protected void setup(){
        addBehaviour(new timer (this,300) );
       // addBehaviour(new timer (this) );
    
    }
        
        
    }
  
    



