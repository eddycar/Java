public class Auto {

    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String patente, String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        motor = new Motor();
    }

    public String getPatente(){
        return patente;
    }
}
