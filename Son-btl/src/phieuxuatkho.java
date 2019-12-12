import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class phieuxuatkho implements Serializable {
	public String maHang;
	public String tenHang;
	public String tenNhaSX;
	public int soLuongXuat;
	public Date ngayXuat;

	public phieuxuatkho(String maHang, String tenHang, String tenNhaSX, int soLuongXuat, Date ngayXuat) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.tenNhaSX = tenNhaSX;

		this.soLuongXuat = soLuongXuat;
		this.ngayXuat = ngayXuat;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getTenNhaSX() {
		return tenNhaSX;
	}

	public void setTenNhaSX(String tenNhaSX) {
		this.tenNhaSX = tenNhaSX;
	}

	public int getSoLuongXuat() {
		return soLuongXuat;
	}

	public void setSoLuongXuat(int soLuongXuat) {
		this.soLuongXuat = soLuongXuat;
	}

	public Date getNgayXuat() {
		return ngayXuat;
	}

	public void setNgayXuat(Date ngayXuat) {
		this.ngayXuat = ngayXuat;
	}

	public phieuxuatkho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public final SimpleDateFormat datetime =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");


	@Override
	public String toString() {
		return "phieuxuatkho [maHang=" + maHang + ", tenHang=" + tenHang + ", tenNhaSX=" + tenNhaSX + ", soLuongXuat="
				+ soLuongXuat + ", ngayXuat=" + datetime.format (getNgayXuat()) + "]";
	}

}
