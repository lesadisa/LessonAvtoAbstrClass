import beep.Beeper;
import door.Doorrun;
import engine.Engine;

// TODO: отформатируй везде код еще пожалуйста, лучше как можно раньше это в привычку себе ввести
public class AvtoPrototype extends Car {

    public AvtoPrototype(Beeper beeper, Engine engine, Doorrun doorrun) {
        super(beeper, engine, doorrun);

    }

public void ChecExzenpl (){

    System.out.println("Единственный экземпляр");
}

public void ChecPrice(){

    System.out.println("не продается");
}

}
