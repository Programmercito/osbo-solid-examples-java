package org.osbo.solid.dependenciasinv;

/**
 *
 * @author programmercito
 */
public class BadDependencias {

    public class MySQL {

        public void save(Object objeto) {
            System.out.println("Agregando objeto a la base de datos");
        }
    }

    public class Persona {
        // si quieres cambiar cambiaras en todos los objetos del sistema
        MySQL mysql;

        public Persona() {
            mysql = new MySQL();
        }

        public void sate(Object object) {
            mysql.save(object);
        }
    }
}
