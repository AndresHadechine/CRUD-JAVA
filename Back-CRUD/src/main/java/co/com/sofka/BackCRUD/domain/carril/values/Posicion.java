package co.com.sofka.BackCRUD.domain.carril.values;

public class Posicion {
    private Integer actual;
    private Integer meta;

    public Posicion(Integer actual, Integer meta) {
        this.actual = actual;
        this.actual = meta;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    public Integer getMeta() {
        return meta;
    }

    public void setMeta(Integer meta) {
        this.meta = meta;
    }
}
