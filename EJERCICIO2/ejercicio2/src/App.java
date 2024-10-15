import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;
import casos.Aleatorios;

public class App {
    public static void main(String[] args) throws Exception {
        try {
        Aleatorios.exepcionAleatoria();
        }
        catch (NumberFormatException e){
        // TODO: handle exception
        System.out.println("Exception NumberFormatException");
        }

        catch (FileNotFoundException e){
        // TODO: handle exception
        System.out.println("Exception FileNotFoundException");
        }

        catch (IOException e){
        // TODO: handle exception
        System.out.println("Exception IOException");
        }

        catch (IndexOutOfBoundsException e){
        // TODO: handle exception
        System.out.println("Exception IndexOutOfBoundsException");
        }

        catch (ArithmeticException e){
        // TODO: handle exception
        System.out.println("Exception ArithmeticException");
        }

    }
}
