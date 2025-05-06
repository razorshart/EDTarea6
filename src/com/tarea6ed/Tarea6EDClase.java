package com.tarea6ed;



public class Tarea6EDClase {
    
     private static final double DESCUENTO_MAYOR_CANTIDAD = 5.0;
    private static final double DESCUENTO_GENERAL = 0.8;
    private static final double DESCUENTO_ALTERNATIVO = 0.95;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR_CANTIDAD;
        }

        double total = calcularTotal(precioProducto, numProductos);
        mostrarTotal(total);
    }

    private double calcularTotal(double precioProducto, int numProductos) {
        return numProductos != 0 ? precioProducto * DESCUENTO_GENERAL : precioProducto * DESCUENTO_ALTERNATIVO;
    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
        
    }

}
