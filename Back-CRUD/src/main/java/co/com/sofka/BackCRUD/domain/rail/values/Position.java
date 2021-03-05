package co.com.sofka.BackCRUD.domain.rail.values;

public class Position {
    private Integer actual;
    private Integer meta;

    public Position(Integer actual, Integer meta) {
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
