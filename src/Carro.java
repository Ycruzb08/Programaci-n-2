public class Carro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private Llanta[] llantas;
    // Agregar otros atributos como airbags, frenos ABS, etc., según sea necesario

    public Carro(Motor motor, Chasis chasis, Carroceria carroceria, Llanta[] llantas) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.llantas = llantas;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(motor).append("\n");
        sb.append(chasis).append("\n");
        sb.append(carroceria).append("\n");
        for (Llanta llanta : llantas) {
            sb.append(llanta).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(TipoCarroceria.TUBULAR, "rojo");
        Llanta[] llantas = {new Llanta("Goodyear", 25, 20, 15)};
        Carro carro = new Carro(motor, chasis, carroceria, llantas);
        System.out.println(carro);
    }
}