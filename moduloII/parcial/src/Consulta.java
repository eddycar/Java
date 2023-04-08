public class Consulta {
    private String especialidad;
    private String fechaConsulta;
    private int hora;
    private int minuto;

    public Consulta(String especialidad, String fechaConsulta, int hora, int minuto) {
        this.especialidad = especialidad;
        this.fechaConsulta = fechaConsulta;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
