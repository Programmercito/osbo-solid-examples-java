package org.osbo.solid.liskov;

/**
 *
 * @author programmercito
 */
public class BadLiskov {

    public class Animal {

        public void caminar() {
            System.out.println("Caminando");
        }

        public void saltar() {
            System.out.println("Saltar");
        }
    }

    public class Perro extends Animal {

        public void ladrar() {
            System.out.println("Ladrar");
        }

        @Override
        public void saltar() {
            throw new RuntimeException("ERRor");
        }
    }

    public class Esquivador {

        public void esquivar(Animal animal) {
            animal.caminar();
            animal.saltar();
            animal.caminar();
        }
    }
}
