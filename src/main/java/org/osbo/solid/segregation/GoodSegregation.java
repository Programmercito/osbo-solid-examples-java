package org.osbo.solid.segregation;

/**
 *
 * @author programmercito
 */
public class GoodSegregation {

    public interface FiguraRectangular {

        public double calculaArea();

        public double getAncho();

        public double getLargo();
    }

    public interface FiguraCircular {

        public double calculaRadio();
    }

    public class Circulo implements FiguraCircular {

        @Override
        public double calculaRadio() {
            System.out.println("Calculando radio");
            return 0;
        }

    }

    public class Rectangulo implements FiguraRectangular {

        @Override
        public double calculaArea() {
            System.out.println("calculo Area");
            return this.getAncho() * this.getLargo();
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
