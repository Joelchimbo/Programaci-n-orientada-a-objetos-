package iterar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusquedaBinariaConTiempo {
    public static void main(String[] args) {
        // Crear una lista de 1000 elementos
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 500000; i++) {
            lista.add(i);
        }

        // Asegurarse de que la lista esté ordenada para usar búsqueda binaria
        Collections.sort(lista);

        // Solicitar al usuario el número a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscar = scanner.nextInt();

        // Medir el tiempo de inicio
        long tiempoInicio = System.nanoTime();

        // Realizar búsqueda binaria
        int indiceEncontrado = busquedaBinaria(lista, numeroBuscar);

        // Medir el tiempo de fin
        long tiempoFin = System.nanoTime();

        if (indiceEncontrado != -1) {
            System.out.println("Número " + numeroBuscar + " encontrado en la posición " + indiceEncontrado);
            // Aquí va el código que procesa el elemento encontrado
        } else {
            System.out.println("Número " + numeroBuscar + " no encontrado en la lista");
        }

        // Calcular y mostrar el tiempo total con decimales
        BigDecimal tiempoTotal = BigDecimal.valueOf(tiempoFin - tiempoInicio).divide(BigDecimal.valueOf(1_000_000_000)); // Convertir a segundos
        System.out.println("Tiempo total de búsqueda: " + tiempoTotal + " segundos");
    }

    // Método para realizar la búsqueda binaria en una lista ordenada
    private static int busquedaBinaria(ArrayList<Integer> lista, int elementoBuscar) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (lista.get(medio) == elementoBuscar) {
                return medio; // Elemento encontrado
            } else if (lista.get(medio) < elementoBuscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // Elemento no encontrado
    }
}
