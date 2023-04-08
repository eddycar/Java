public class Test {
    public static void main(String[] args) {
        OfertaAcademica frontEnd= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso)frontEnd).setDuracion(2);
        ((Curso)frontEnd).setValorHora(1000);
        ((Curso)frontEnd).setCargaHoraria(16);

        OfertaAcademica backEnd= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("BackEnd");
        ((Curso)backEnd).setDuracion(2);
        ((Curso)backEnd).setValorHora(900);
        ((Curso)backEnd).setCargaHoraria(20);

        OfertaAcademica fullStack=OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack-Front y Back");
        ((ProgramaIntensivo)fullStack).setPorcentajeBonificacion(0.20);

        //completar FullStack
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(frontEnd);
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(backEnd);

        Instituto dh= new Instituto("Digital House");
        dh.agregarOferta(frontEnd);
        dh.agregarOferta(backEnd);
        dh.agregarOferta(fullStack);
        System.out.println("Informe de ofertas disponibles en el Instituto");
        dh.generarInforme();

    }
}
