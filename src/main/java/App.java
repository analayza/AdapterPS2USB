public class App {
    public static void main(String[] args) {
        var usb = new EntradaUSBConcreto();
        var ps2 = new PS2Concreto();
        var adapt = new AdaptadorUSBtoPS2();

        System.out.println(adapt.adaptador(ps2));
    }
}
