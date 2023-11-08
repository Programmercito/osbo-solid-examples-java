package org.osbo.solid.openclosed;

/**
 *
 * @author programmercito
 */
public class BadOpenClose {

    public class Impresor {

        String tipo;

        public Impresor(String tipo) {
            this.tipo = tipo;
        }

        public void imprimir(String text) {
            if (tipo.equals("json")) {
                System.out.println("{\"texto\":\"" + text + "\"}");
            } else if (tipo.equals("xml")) {
                System.out.println("<texto>" + text + "</texto>");
            } else if (tipo.equals("text")) {
                System.out.println(text);
            }
        }
    }
}
