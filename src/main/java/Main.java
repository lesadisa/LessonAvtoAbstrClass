import beep.BeepMusic;
import beep.Beeplong;
import door.Doorclosed;
import door.Dooropen;
import engine.Engine12v;
import engine.EngineSuper;
import engine.EnginevProt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BeepMusic bmusic = new BeepMusic();
        Beeplong beeplong = new Beeplong();
        Dooropen dooropen = new Dooropen();
        Doorclosed dclosed = new Doorclosed();
        Engine12v en12 = new Engine12v();
        EngineSuper engineSuper = new EngineSuper();

        Lambo lamb = new Lambo(bmusic, en12, dclosed);
        Sportcar sportcar = new Sportcar(beeplong, engineSuper, dooropen);
        AvtoPrototype avtoPrototype = new AvtoPrototype(beeplong, new EnginevProt(), dooropen);

        ArrayList<Car> carlist = new ArrayList<Car>();

        carlist.add(lamb);
        carlist.add(sportcar);


        for (Car car : carlist) {
            System.out.println(car.checkBeep());
            System.out.println(car.checkEngi());
            System.out.println(car.checkDoor());
        }

        System.out.println("Прототип");
        avtoPrototype.ChecExzenpl();
        avtoPrototype.ChecPrice();

    }
}
