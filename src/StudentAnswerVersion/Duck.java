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
public abstract class Duck {
    
    private Flyable flyable;
    private Quackable quackable;
    private Display display;
    
    public Duck () {}

    public Flyable getFlyable() {
        return flyable;
    }

    public final void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public final void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public Display getDisplay() {
        return display;
    }

    public final void setDisplay(Display display) {
        this.display = display;
    }
    
    public final void performFly() {
        flyable.fly();
    }
    
    public final void performQuack() {
        quackable.quack();
    }
    
}
