public class Lamp implements IOnOffServer{

    public Lamp() {
    }

    @Override
    public void Activate() {
        System.out.println("Lampara apagada");
    }

    @Override
    public void Deactivate() {
        System.out.println("Lampara encendida");
    }
}
