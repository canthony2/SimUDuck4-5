/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentAnswerVersion;

/**
 *
 * @author knyghtspup
 */
public abstract class FlyWithOther implements Flyable{
    @Override
    public void fly() {
        System.out.println("I believe I can fly! I believe I can touch the sky!");
    }
}
