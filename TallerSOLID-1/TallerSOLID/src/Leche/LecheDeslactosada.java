package Leche;

public class LecheDeslactosada implements LecheDescremada1 {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }

    @Override
    public void usarPastel() {
        // Lanzar error No se puede usar en pastel
        throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
    }
    
        
}
