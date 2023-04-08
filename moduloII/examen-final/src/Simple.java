public class Simple extends Pizza {
    private double precio;
    private boolean esGrande;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean EsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        if (esGrande == true) return precio * 2;
        else return precio;
    }
}
