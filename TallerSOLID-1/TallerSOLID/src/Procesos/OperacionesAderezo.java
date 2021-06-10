package Procesos;

import Adicionales.Aderezo;
import Postres.Pastel;
import Postres.Helado;

public class OperacionesAderezo {
    
    public static void anadirAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    public static void anadirAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().remove(aderezo);
    }
    
}
