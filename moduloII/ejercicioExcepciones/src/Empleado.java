public class Empleado {

        private String nombre;
        private String apellido;
        private float sueldo;
        public Empleado(String nombre, String apellido, float sueldo)
        {
            if (nombre == null || nombre == "") throw new RuntimeException("Nombre no puede estar vacío");
            if (apellido == null || apellido == "") throw new RuntimeException("Apellido no puede estar vacío");
            if (sueldo <=0) throw new RuntimeException("Sueldo no puede ser menor a cero");
            this.nombre=nombre;
            this.apellido=apellido;
            this.sueldo=sueldo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
