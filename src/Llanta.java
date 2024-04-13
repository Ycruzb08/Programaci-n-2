public class Llanta {
    private String marca;
    private int diametroRin;
    private int altura;
    private int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public String toString() {
        return "Llanta: Marca = " + marca + ", Diámetro del Rín = " + diametroRin +
               " pulgadas, Altura = " + altura + " pulgadas, Anchura = " + anchura + " pulgadas";
    }
}