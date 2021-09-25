package principal;

public class Importado {
	private String marca;
	private String modelo;
	private String anio;
	private String placa;
	private int kilometraje;
	private String cdimporte;
	private String valor;
	
	public Importado(String m1 , String m2, String a2 , String pl2 , int kl2  , String ci, String vl) {
		marca =m1;
		modelo =m2;
		anio =a2;
		placa= pl2;
		kilometraje =kl2;
		cdimporte=ci;
		valor=vl;
		
	}
	
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public String getCdimporte() {
		return cdimporte;
	}
	public void setCdimporte(String cdimporte) {
		this.cdimporte = cdimporte;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	} 
	
	
	

}
