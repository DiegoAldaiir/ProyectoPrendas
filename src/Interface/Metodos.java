package Interface;

import java.util.List;

import Dominio.Ropas;

public interface Metodos {

	//metodos tenemos dos cosas
	//1---Funciones (tienen valor de retorno)
	//contemplar lo siguiente: que tipo de entorno tendra, ver si recibira parametros o no, si va a recibir parametros cuantos y de que tipo
	//modificadorDeAcceso tipoRetorno nombreFuncion (los parametros)
	
	//2---Procedimiento(no tienen valor de retorno)
	//ver si recibira parametros o no, si va a recibir parametros cuantos y de que tipo
	//modificadorDeAcceso void(vacio) nombreProcedimiento (los parametros)
	
	
	//Procedimiento
	public void guardar(Ropas ropa);
	
	//funcion
public List<Ropas> mostrar();
	
	public Ropas buscar (int indice);
	
	public void editar (int indice, Ropas ropa);
	
	public void eliminar (int indice);
	
	
	
}
