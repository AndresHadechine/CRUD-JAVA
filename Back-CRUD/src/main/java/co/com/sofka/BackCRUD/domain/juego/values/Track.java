package co.com.sofka.BackCRUD.domain.juego.values;

public class Track {

    private Integer kilometres;
    private Integer numeroDeCarriles;

    public Track(Integer kilometres, Integer numeroDeCarriles) {
        this.kilometres = kilometres;
        this.numeroDeCarriles = numeroDeCarriles;
    }

    public Integer getKilometres() {
        return kilometres;
    }

    public Integer getNumeroDeCarriles() {
        return numeroDeCarriles;
    }
}
