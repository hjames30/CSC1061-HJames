import java.util.ArrayList;
import java.util.List;

public class ReverseList<E> {
	private List<E> list = new ArrayList<E>();
	//instead of adding Objects to the end of the list adds to the begin of the list
	public void add(E input) {
		list.add(0,input);
		
	}
	public List<E>getList(){
		return list;
	}
}
