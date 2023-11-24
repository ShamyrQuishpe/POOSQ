public class Juegos {

    //atributos
    public String titulo;
    public int año;
    public String tipo;
    public String desarrolladora;

    //metodo constructor
    public Juegos(String titulo, int año, String tipo, String desarrolladora){
        this.titulo=titulo;
        this.año=año;
        this.tipo=tipo;
        this.desarrolladora=desarrolladora;
    }

    //metodos
    public void imprimir(){
        System.out.println("El juedo de " + titulo + " salio en el año " + año + " por la desarrolladora " + desarrolladora);
    }
    public void clasificacion(){
        System.out.println("El juego es considerado como tipo " + tipo);
    }

    public static void main(String[] args){
        Juegos juego1 = new Juegos("Zelda", 1986, "Rol", "Nintendo");
        juego1.imprimir();
        juego1.clasificacion();
        Juegos juego2 = new Juegos("Final Fantasy", 1987, "RPG", "Square Enix");
        juego2.imprimir();
        juego2.clasificacion();
        Juegos juego3 = new Juegos("Resident Evil", 1998, "Survival Horror", "Capcom");
        juego3.imprimir();
        juego3.clasificacion();
    }
}
