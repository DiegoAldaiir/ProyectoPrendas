package Main;

import Dominio.Ropas;
import Implementacion.LogicaMetodos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar la coleccion de objetos
		Ropas ropa1 = new Ropas("prada", 240, "gris", 5);
		Ropas ropa2 = new Ropas("mege", 250, "azul", 6);

		// instancia de clase-----ya tenemos acceso a todo lo que contenga la clase
		LogicaMetodos imp = new LogicaMetodos();

		// guardar
		imp.guardar(ropa1);
		imp.guardar(ropa2);

		// mostrar
		System.out.println(imp.mostrar());

		// buscar
		Ropas ropaEnco = null;
		ropaEnco = imp.buscar(1);
		System.out.println("se encontro " + ropaEnco);

		// editar
		// actualizar objeto
		ropaEnco.setColor("rojo");
		// actualizar en la lista
		imp.editar(1, ropaEnco);

		// mostrar
		System.out.println(imp.mostrar());

		// eliminar
		imp.eliminar(0);

		// mostrar
		System.out.println(imp.mostrar());

	}

}
