public class Final extends Examen implements Comparable{
    private double notaOral;
    private String temaOral;

    @Override
    public boolean estaAprobado(){
        return (notaOral>=4 && getNota()>=4);
    }


    @Override
    public int compareTo(Object o) {
        Final comp=(Final)o;
        int resp=0;
        double promedioMio=(notaOral+getNota())/2;
        double promedioParam=(comp.notaOral+comp.getNota())/2;
        if (promedioMio>promedioParam){
            resp=1;
        }
        if (promedioMio<promedioParam){
            resp=-1;
        }
        return resp;
    }
}
