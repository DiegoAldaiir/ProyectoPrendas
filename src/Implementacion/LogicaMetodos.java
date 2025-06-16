package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Ropas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	
	private List<Ropas> lista = new ArrayList<Ropas>();
	
	//Polimorfismo de sobreescritura
	@Override
	public void guardar(Ropas ropa) {
		// TODO Auto-generated method stub
		lista.add(ropa);
	}

	@Override
	public List<Ropas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Ropas buscar(int indice) {
		// TODO Auto-generated method stub
		Ropas ropaEncontra = lista.get(indice);
		return ropaEncontra;
	}

	@Override
	public void editar(int indice, Ropas ropa) {
		// TODO Auto-generated method stub
		lista.set(indice, ropa);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
