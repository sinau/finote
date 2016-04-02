package finote.project.model;

public class Invoice {
	private String nomorFaktur;
	private String tanggalFaktur;
	private String lastUser;
	private String dariKepada;
	private String lastUpdate;
	private String keterangan;

	public String getNomorFaktur() {
		return nomorFaktur;
	}

	public void setNomorFaktur(String nomorFaktur) {
		this.nomorFaktur = nomorFaktur;
	}

	public String getTanggalFaktur() {
		return tanggalFaktur;
	}

	public void setTanggalFaktur(String tanggalFaktur) {
		this.tanggalFaktur = tanggalFaktur;
	}

	public String getLastUser() {
		return lastUser;
	}

	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}

	public String getDariKepada() {
		return dariKepada;
	}

	public void setDariKepada(String dariKepada) {
		this.dariKepada = dariKepada;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

}
