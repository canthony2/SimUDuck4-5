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
public abstract class Squeak implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak Squeak!");
    }
}
