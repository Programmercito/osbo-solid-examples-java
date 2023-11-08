package org.osbo.solid.segregation;

/**
 *
 * @author programmercito
 */
public class BadSegregation {

    public interface Figura {

        public double calculaArea();

        public double calculaRadio();

        public double getAncho();

        public double getLargo();
    }

    public class Rectangulo implements Figura {

        @Override
        public double calculaArea() {
            System.out.println("calculo Area");
            return this.getAncho() * this.getLargo();
        }

        @Override
        public double calculaRadio() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public double getAncho() {
            System.out.println("devuelvo ancho");
            return 0;
        }

        @Override
        public double getLargo() {
            System.out.println("devuelvo largo");
            return 0;
        }
    }
}
