import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentajeBonificacion;
    private List<OfertaAcademica> ofertasAcademicas= new ArrayList<>();

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(List<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }

    @Override
    public double calcularPrecio() {
        double total=0;
        for (OfertaAcademica oferta:ofertasAcademicas) {
            total+=oferta.calcularPrecio();
        }
        return total-(total*porcentajeBonificacion);
    }

    public void addOfertaAcademica(OfertaAcademica oa){
        ofertasAcademicas.add(oa);
    }
}
