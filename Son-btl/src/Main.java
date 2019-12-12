import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static List list= new List();
	public static Scanner nhap= new Scanner(System.in);
	public static void main(String[] args) {
		boolean quit = false;
		while (!quit) {
			menu();
			System.out.print("Nhap vao lua chon cua ban: ");
			int choice = nhap.nextInt();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				list.show();;
				break;
			case 3:
				searchByName();
				break;
			case 4:
				list.sortByName();
				break;
			case 5: 
				list.sortbyCost();
				break;
			case 6: 
				searchByDate();
				break;
			case 7:
				try {
					list.luuDSHDFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8: 
				try {
					list.docDSHDFile();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 0:
				quit = true;
				System.out.println("Ket Thuc chuong trinh");
				break;
			}
		}
	}
	public static void menu() {
		System.out.println("1. Nhap phieu xuat");
		System.out.println("2. hien danh sach phieu xuat");
		System.out.println("3. tim hang hoa theo ten");
		System.out.println("4. Sap xep theo ten hang hoa");
		System.out.println("5. Sap xep theo ngay xuat");
		System.out.println("6. Tim theo ngay xuat");
		System.out.println("7. Luu file");
		System.out.println("8. Nhap file");
	}
	public static Date formart(String date) {
		SimpleDateFormat formart = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		Date date1;
		try {
			date1 = formart.parse(date);
			return date1;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	public static void add() {
		System.out.println("Nhap ma hang: ");
		nhap.nextLine();
		String a= nhap.nextLine();
		System.out.println("Nhap ten hang: ");
		String b= nhap.nextLine();
		System.out.println("Nhap ten nha san xuat: ");
		String c= nhap.nextLine();
		System.out.println("Nhap so luong xuat kho: ");
		int d= nhap.nextInt();
		System.out.println("Nhap ngay xuat: ");
		nhap.nextLine();
		String  e= nhap.nextLine();
		Date e1= formart(e);
		phieuxuatkho phieuxuatkho= new phieuxuatkho(a,b,c,d,e1);
		list.add(phieuxuatkho);
	}
	public static void searchByName() {
		System.out.println("Nhap ten hang can tim: ");
		nhap.nextLine();
		String a= nhap.nextLine();
		list.searchByName(a);
	}
	public static void searchByDate() {
		System.out.println("Nhap ngay can tim: ");
		nhap.nextLine();
		String a= nhap.nextLine();
		Date a1= formart(a);
		list.searchByDate(a1);
	}
}
