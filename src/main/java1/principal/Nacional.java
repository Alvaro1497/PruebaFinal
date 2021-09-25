package principal;

public class Nacional {

	private String marca;
	private String modelo;
	private String anio;
	private String placa;
	private int kilometraje;
	private String codigo;

	public Nacional(String m, String mm, String a, String pl, int kl, String cd) {
		marca = m;
		modelo = mm;
		anio = a;
		placa = pl;
		kilometraje = kl;
		codigo = cd;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
}
