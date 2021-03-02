package co.com.sofka.BackCRUD.domain.juego.values;

public class Pista {

    private Integer kilometros;
    private Integer numeroDeCarriles;

    public Pista(Integer kilometros, Integer numeroDeCarriles) {
        this.kilometros = kilometros;
        this.numeroDeCarriles = numeroDeCarriles;
    }

    public Integer getKilometros() {
        return kilometros;
    }

    public Integer getNumeroDeCarriles() {
        return numeroDeCarriles;
    }
}
