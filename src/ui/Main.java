package ui;

import data.GestorEntidades;

public class Main {

    public static void main(String[] args) {

        // 1. Inicializar el Gestor de Entidades con la colección
        GestorEntidades gestor = new GestorEntidades();

        // 2. Ejecutar la lógica de recorrido (para prueba en consola)
        gestor.recorrerYMostrarEntidades();

        // 3. Inicializar la Interfaz Gráfica Básica
        GUIManager gui = new GUIManager(gestor);
        gui.iniciarGUI();
    }
}
