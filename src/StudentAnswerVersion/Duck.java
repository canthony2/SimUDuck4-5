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
public class Duck {
    
    private String name;
    private Flyable flyable;
    private Quackable quackable;
    private DisplayMode displayMode;
    
    public Duck(String name, Flyable flyable, Quackable quackable, DisplayMode displayMode) {
        this.name = name;
        this.flyable = flyable;
        this.quackable = quackable;
        this.displayMode = displayMode;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    
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

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public final void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }
    
    public final void performFly() {
        flyable.fly();
    }
    
    public final void performQuack() {
        quackable.quack();
    }
    
    public final void performDisplay() {
        displayMode.display();
    }
    
}
