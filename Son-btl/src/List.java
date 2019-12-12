import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class List {
	
	ArrayList<phieuxuatkho> list = new ArrayList<phieuxuatkho>();
	public void add(phieuxuatkho phieuxuatkho) {
		list.add(phieuxuatkho);
	}
	public void show() {
		for (phieuxuatkho phieuxuatkho : list) {
			System.out.println(phieuxuatkho);
		}
	}
	public void searchByName(String name) {
		int i=0;
		for (phieuxuatkho phieuxuatkho : list) {
			if(phieuxuatkho.getTenHang().equals(name)) {
				System.out.println(phieuxuatkho);
				i++;
			}
		}
		if(i==0) {
			System.out.println("Khong co "+name+" trong danh sach xuat kho");
		}
	}
	public void sortByName() {
		System.out.println("Danh sach sau khi sap xep: ");
		list.sort(new Sapxep());
		show();
	}
	public void searchByDate(Date date) {
		int i=0;
		for (phieuxuatkho phieuxuatkho : list) {
			if(phieuxuatkho.getNgayXuat().equals(date)) {
				System.out.println(phieuxuatkho);
				i++;
			}
		}if(i==0) {
			System.out.println("Khong tim thay ngay " +date+ " trong danh sach");
		}
	}
	public void sortbyCost() {
		System.out.println("Danh sach phieu xuat kho sau sap xep: ");
		list.sort(new sortByDate());
		show();
	}
	
	public void luuDSHDFile() throws IOException {
		FileOutputStream fout = new FileOutputStream("dshd.bin");
		ObjectOutputStream objOut = new ObjectOutputStream(fout);
		objOut.writeObject(list);
		objOut.close();
		fout.close();
		System.out.println("Lưu thành công!");
	}

	public void docDSHDFile() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("dshd.bin");
		ObjectInputStream objIn = new ObjectInputStream(fin);
		list = (ArrayList)objIn.readObject();
		objIn.close();
		fin.close();
		System.out.println("Đọc thành công!");
	}

}
