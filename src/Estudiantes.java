public class Estudiantes {
    //Atributos

    private String nombre;
    private int edad;

    private Estudiantes(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }
        private void saludar(){
            System.out.println("NOMBRE: " + nombre);
            System.out.println("EDAD: " + edad);

        }


        public static void main(String[] args) {
            Estudiantes estudiante_desarrollo = new Estudiantes("MATEA", 25);
            estudiante_desarrollo.saludar();
            Estudiantes estudiantes_redes = new Estudiantes("MIGUELANGELA", 20);
            estudiantes_redes.saludar();
        }

}
