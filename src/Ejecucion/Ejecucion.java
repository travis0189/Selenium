package Ejecucion;

import Metodos.Metodos;
import org.testng.annotations.Test;


public class Ejecucion {

     Metodos pom = new  Metodos();

        @Test(priority=0)
        public void Abrir(){
        pom.pagina();
    }

    @Test(priority=1)
    public void Vuelo() throws InterruptedException {
        pom.buscarVuelo();
    }

    @Test(priority=2)
    public void Elegir() throws InterruptedException {
        pom.elegirVuelo();
    }

    @Test(priority=3)
    public void Captura() throws InterruptedException {
        pom.CapturaVuelo();
    }

}
