public class Taller extends OfertaAcademica{
    private double cantTrabajos;
    private double valorTrabajoPractico;

    public double getCantTrabajos() {
        return cantTrabajos;
    }

    public void setCantTrabajos(double cantTrabajos) {
        this.cantTrabajos = cantTrabajos;
    }

    public double getValorTrabajoPractico() {
        return valorTrabajoPractico;
    }

    public void setValorTrabajoPractico(double valorTrabajoPractico) {
        this.valorTrabajoPractico = valorTrabajoPractico;
    }

    @Override
    public double calcularPrecio() {
        return cantTrabajos * valorTrabajoPractico;
    }
}
