package finote.project.model;

public class InvoiceItem {
	private String idAcount;
	private String idInvoice;
	private String namaPerkiraan;
	private String cc;
	private String uraian;
	private String debit;
	private String kredit;

	public String getIdAcount() {
		return idAcount;
	}

	public void setIdAcount(String idAcount) {
		this.idAcount = idAcount;
	}

	public String getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(String idInvoice) {
		this.idInvoice = idInvoice;
	}

	public String getNamaPerkiraan() {
		return namaPerkiraan;
	}

	public void setNamaPerkiraan(String namaPerkiraan) {
		this.namaPerkiraan = namaPerkiraan;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getUraian() {
		return uraian;
	}

	public void setUraian(String uraian) {
		this.uraian = uraian;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	public String getKredit() {
		return kredit;
	}

	public void setKredit(String kredit) {
		this.kredit = kredit;
	}
}
