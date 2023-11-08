package org.osbo.solid.openclosed;

/**
 *
 * @author programmercito
 */
public class GoodOpenClose {

    public interface ImpresoraSalida {

        public void imprimir(String text);
    }

    public enum TipoImpresion {
        JSON,
        XML,
        TEXT
    }

    public class ImpresoraJson implements ImpresoraSalida {

        @Override
        public void imprimir(String text) {
            System.out.println("{\"texto\":\"" + text + "\"}");
        }

    }

    public class ImpresoraXml implements ImpresoraSalida {

        @Override
        public void imprimir(String text) {
            System.out.println("<texto>" + text + "</texto>");
        }

    }

    public class ImpresoraText implements ImpresoraSalida {

        @Override
        public void imprimir(String text) {
            System.out.println(text);
        }

    }

    public class Impresora {

        ImpresoraSalida impresora;

        public Impresora(ImpresoraSalida impresorasalida) {
            this.impresora = impresorasalida;
        }

        public void imprimir(String text) {
            impresora.imprimir(text);
        }
    }
}
