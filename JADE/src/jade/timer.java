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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import jade.core.behaviours.*;
import jade.core.Agent;

/**
 *
 * @author AFRIZAL
 */
public class timer extends TickerBehaviour {

    int timer = 10;

    public timer(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {

        if (timer >= 0) {
            System.out.print(timer-- + ",");
        } else {

            System.out.print("Time is out!!");
            myAgent.doDelete();
        }

    }
}
