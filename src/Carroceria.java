public class Carroceria {
    private TipoCarroceria tipo;
    private String color;

    public Carroceria(TipoCarroceria tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String toString() {
        return "Carroceria: Tipo = " + tipo + ", Color = " + color;
    }
}