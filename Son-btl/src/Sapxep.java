import java.util.Comparator;

public class Sapxep  implements Comparator<phieuxuatkho>{

	@Override
	public int compare(phieuxuatkho o1, phieuxuatkho o2) {
		if(o1.getTenHang().compareTo(o2.getTenHang())<0) {
			return -1;
		}else if(o1.getTenHang().compareTo(o2.getTenHang())>0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
class sortByDate implements Comparator<phieuxuatkho> {

	@Override
	public int compare(phieuxuatkho o1, phieuxuatkho o2) {
		// TODO Auto-generated method stub
		if(o1.getNgayXuat().compareTo(o2.getNgayXuat())<0) {
			return -1;
		}else if(o1.getNgayXuat().compareTo(o2.getNgayXuat())>0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
