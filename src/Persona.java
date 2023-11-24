public class Persona {
    //atributos
    public int cedula;
    public String nombre;
    public int edad;

    //metodo constructor
    public Persona(int cedula, String nombre, int edad){
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
    }

    //metodo saludar
    public void saludar(){
        System.out.println("Hola "+ nombre);
    }
    public static void main(String[] args) {

        //creacion de objetos
        Persona persona1 = new Persona(1896857412, "Shamyr", 20);
        Persona persona2 = new Persona(1223456987, "Matea", 20);
        Persona persona3 = new Persona(1478523698, "Miguel", 20);

        //impresion de objetos
        System.out.println("La cedula de la persona 1 es: " + persona1.cedula);
        System.out.println("El nombre de la persona 1 es: " + persona1.nombre);
        System.out.println("La edad de la persona 1 es: "+ persona1.edad);

        System.out.println("La cedula de la persona 2 es: " + persona2.cedula);
        System.out.println("El nombre de la persona 2 es: " + persona2.nombre);
        System.out.println("La edad de la persona 2 es: "+ persona2.edad);

        System.out.println("La cedula de la persona 3 es: " + persona3.cedula);
        System.out.println("El nombre de la persona 3 es: " + persona3.nombre);
        System.out.println("La edad de la persona 3 es: "+ persona3.edad);

        //llamada del metodo con el objeto

        persona1.saludar();

        persona2.saludar();

        persona3.saludar();
    }
}
