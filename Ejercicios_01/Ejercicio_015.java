public class Ejercicio_015 {
    public static void main(String[] args) {

        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        System.out.println("\tL" + "\tM" + "\tX" + "\tJ" + "\tV");
        System.out.println( "\t------" + "\t------"+"\t------" + "\t------"+"\t------");
        System.out.println( naranja+"\tGimna" + verde+"\tNatu" + rojo+"\tSocial" + azul+"\tLengua"+ morado+"\tMate");
        System.out.println( verde+"\tNatu" + rojo+"\tSocial" + azul+"\tLengua" +  morado+"\tMate" + naranja+"\tGimna");
        System.out.println( rojo+"\tSocial" + azul+"\tLengua" +  morado+"\tMate" + naranja+"\tGimna"+ verde+"\tNatu");
        System.out.println( azul+"\tLengua" +  morado+"\tMate" + naranja+"\tGimna"+ verde+"\tNatu" + rojo+"\tSocial");

    }
}
