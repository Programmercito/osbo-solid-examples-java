package org.osbo.solid.singleresponsability;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author programmercito
 */
public class BadSingle {

    public class Producto {

        public List<Producto> getProductos() {
            System.out.println("Conecto a base de datos");
            System.out.println("Consulto a todos los productos");
            return new ArrayList<Producto>();
        }
    }

}
