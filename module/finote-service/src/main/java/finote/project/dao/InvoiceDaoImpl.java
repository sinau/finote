package finote.project.dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import finote.project.model.Invoice;

public class InvoiceDaoImpl implements InvoiceDao {
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement getByIdStatement;
	private PreparedStatement getAllStatement;

	private final String INSERT_QUERY = "insert into invoice(no_faktur,tgl_faktur,last_user,dari_kepada,last_update,keterangan)values(?,?,?,?,?,?)";
	private final String UPDATE_QUERY = " Update invoice set tgl_faktur=?,last_user=?,dari_kepada=?,last_update=?,keterangan=? where no_faktur=?";
	private final String DELETE_QUERY = " delete From invoice where no_faktur=?";
	private final String GET_BY_ID_QUERY = "select no_faktur,tgl_faktur,last_user,dari_kepada,last_update,keterangan from Invoice where No_Faktur=?";
	private final String GET_ALL_QUERY = " select no_faktur,tgl_faktur,last_user,dari_kepada,last_update,keterangan from Invoice";

	public void Connection(Connection connection) throws SQLException {
		this.connection = connection;
		insertStatement = this.connection.prepareStatement(INSERT_QUERY);
		updateStatement = this.connection.prepareStatement(UPDATE_QUERY);
		deleteStatement = this.connection.prepareStatement(DELETE_QUERY);
		getByIdStatement = this.connection.prepareStatement(GET_BY_ID_QUERY);
		getAllStatement = this.connection.prepareStatement(GET_ALL_QUERY);
	}

	public Invoice SaveOrUpdate(Invoice invoice, boolean isUpdate) throws SQLException {
		// TODO Auto-generated method stub
		if (!isUpdate) {
			insertStatement.setString(1, invoice.getNomorFaktur());
			insertStatement.setString(2, invoice.getTanggalFaktur());
			insertStatement.setString(3, invoice.getLastUser());
			insertStatement.setString(4, invoice.getDariKepada());
			insertStatement.setString(5, invoice.getLastUpdate());
			insertStatement.setString(6, invoice.getKeterangan());
			insertStatement.executeUpdate();
		} else {
			updateStatement.setString(1, invoice.getNomorFaktur());
			updateStatement.setString(2, invoice.getTanggalFaktur());
			updateStatement.setString(3, invoice.getLastUser());
			updateStatement.setString(4, invoice.getDariKepada());
			updateStatement.setString(5, invoice.getLastUpdate());
			updateStatement.setString(6, invoice.getKeterangan());
			updateStatement.executeUpdate();
		}
		return invoice;
	}

	public Invoice delete(Invoice invoice) throws SQLException {
		// TODO Auto-generated method stub
		deleteStatement.setString(1, invoice.getNomorFaktur());
		deleteStatement.executeUpdate();
		return invoice;
	}

	public Invoice getById(String nomorFaktur) throws SQLException {
		// TODO Auto-generated method stub
		getByIdStatement.setString(1, nomorFaktur);
		ResultSet rs = getByIdStatement.executeQuery();
		if (rs.next()) {
			Invoice invoice = new Invoice();
			invoice.setNomorFaktur(rs.getString("no_faktur"));
			invoice.setTanggalFaktur(rs.getString("tgl_faktur"));
			invoice.setLastUser(rs.getString("last_user"));
			invoice.setDariKepada(rs.getString("dari_kepada"));
			invoice.setLastUpdate(rs.getString("last_user"));
			invoice.setKeterangan(rs.getString("keterangan"));
			return invoice;
		}
		return null;
	}

	public List<Invoice> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Invoice> invoice = new ArrayList<Invoice>();
		ResultSet rs = getAllStatement.executeQuery();
		while (rs.next()) {
			Invoice i = new Invoice();
			i.setNomorFaktur(rs.getString("no_faktur"));
			i.setTanggalFaktur(rs.getString("tgl_faktur"));
			i.setLastUser(rs.getString("last_user"));
			i.setDariKepada(rs.getString("dari_kepada"));
			i.setLastUpdate(rs.getString("last_user"));
			i.setKeterangan(rs.getString("keterangan"));
			invoice.add(i);
		}
		return invoice;
	}

}
