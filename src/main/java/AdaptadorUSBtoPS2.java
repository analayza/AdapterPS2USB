public class AdaptadorUSBtoPS2 extends EntradaUSBConcreto{

    public String adaptador(PS2Concreto ps2){
        return ps2.conector().concat(nomeDaRede());
    }

}
