import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private double valorBasico;
    private List<OfertaAcademica> ofertasAcademicas= new ArrayList<>();

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }

    public void addOfertaAcademica(OfertaAcademica oa){
        ofertasAcademicas.add(oa);
    }

    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oferta:ofertasAcademicas) {
            total+=oferta.calcularPrecio();
        }
        return total += valorBasico;
    }
}
