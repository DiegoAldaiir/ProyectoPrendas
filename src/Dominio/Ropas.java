package Dominio;

public class Ropas {

	private String marca;
	private float precio;
	private String color;
	private int existencia;
	
	public Ropas(String marca, float precio, String color, int existencia) {
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Ropas [marca=" + marca + ", precio=" + precio + ", color=" + color + ", existencia=" + existencia + "]\n";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
}
