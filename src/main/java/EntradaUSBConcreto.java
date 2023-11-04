public class EntradaUSBConcreto extends EntradaUSB <PS2Concreto>{

    @Override
    public String conectar(PS2Concreto ps2) {
        return ps2.conector().concat(nomeDaRede());
    }

    @Override
    public String nomeDaRede() {
        return "entrada USB.";
    }
}
