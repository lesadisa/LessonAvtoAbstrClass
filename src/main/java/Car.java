import beep.Beeper;
import door.Doorrun;
import engine.Engine;

public abstract class Car {

private Beeper beeper;
private Engine engine;
private Doorrun doorrun;

public Car(Beeper beeper, Engine engine, Doorrun doorrun){
this.beeper=beeper;
this.engine=engine;
this.doorrun=doorrun;


}

    public String checkBeep() {
return beeper.makeSound();
    }

    public String checkEngi() {
        return engine.makeEngine();
    }

    public String checkDoor() {
        return doorrun.makeDorrun();
    }
}
