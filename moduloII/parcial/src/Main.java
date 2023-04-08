public class Main {
    public static void main(String[] args) {
        Consulta consulta1 = new Consulta("optometria","18/10/2022",12,30);
        Consulta consulta2 = new Consulta("fisioterapia","18/10/2022",12,30);
        Consulta consulta3 = new Consulta("ortopedia","18/10/2022",12,30);
        Particular paciente1  = new Particular("Pepito","Perez","08/10/1990",true,consulta1);
        System.out.println(paciente1.evaluacionInicial());
        ObraSocial paciente2 = new ObraSocial("juan", "perez","10/04/1992",false, consulta2,"obra1",1234);
        ObraSocial paciente3 = new ObraSocial("juan", "perez","10/04/1992",false, consulta2,"obra1",1235);
        System.out.println(paciente2.compareTo(paciente3));
    }
}
