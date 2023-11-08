package org.osbo.solid.dependenciasinv;

/**
 *
 * @author programmercito
 */
public class GoodDependencias {

    public interface IPersistence {

        public void save(Object objeto);
    }

    public class MySQL implements IPersistence {

        public void save(Object objeto) {
            System.out.println("Agregando objeto a la base de datos mysql");
        }
    }

    public class Oracle implements IPersistence {

        public void save(Object objeto) {
            System.out.println("Agregando objeto a la base de datos oracle");
        }
    }

    public class Persona {

        IPersistence data;

        public Persona(IPersistence persistence) {
            this.data = persistence;
        }

        public void sate(Object object) {
            this.data.save(object);
        }
    }
}
