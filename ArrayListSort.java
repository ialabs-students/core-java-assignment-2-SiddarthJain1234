import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<BigInteger> list = new ArrayList<BigInteger>();
	list.add(new BigInteger("5123"));
	list.add(new BigInteger("52"));
	list.add(new BigInteger("1"));
	list.add(new BigInteger("4"));

	arrayListSortDesc(list);
	System.out.println(list);

	}

public static void arrayListSortDesc(ArrayList<BigInteger> list){
	Collections.sort(list, Collections.reverseOrder());
	}

}
