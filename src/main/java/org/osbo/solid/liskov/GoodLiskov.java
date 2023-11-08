package org.osbo.solid.liskov;

/**
 *
 * @author programmercito
 */
public class GoodLiskov {

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
            System.out.println("Saltar como perrito");
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
