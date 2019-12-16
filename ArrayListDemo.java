import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	static ArrayList<String> revArrayList = null;

	public static void main(String[] args) {

		ArrayList<String> arrList = addList();

		// update element on particular index
		// int index =1;
		// updateArraylist(arrList,index);

		// retrive Updated ArrayList
		getArrayList(arrList);

		// Search element in Array List
		// String str = "ghy";
		// searchElement(arrList,str);

		// sort ArrayList
		// sortArrayList(arrList);

		// copy AL to other AL
		// copy(arrList);

		// Reverse Arraylist
		//revArrayList = getReverseArrayList(arrList);
		//getArrayList(revArrayList);

	}

	public static ArrayList<String> getReverseArrayList(ArrayList<String> arrList) {

		revArrayList = new ArrayList<>();

		for (int i = arrList.size() - 1; i >= 0; i--) {
			revArrayList.add(arrList.get(i));
		}

		return revArrayList;
	}

	private static void getArrayList(ArrayList<String> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("------------------");
	}

	private static void updateArraylist(ArrayList<String> arrList, int index) {
		arrList.set(1, "Avinash");
	}

	private static ArrayList<String> copy(ArrayList<String> arrList) {

		ArrayList<String> arrListCopy = (ArrayList<String>) arrList.clone();

		return arrListCopy;
	}

	private static void sortArrayList(ArrayList<String> arrList) {

		Collections.sort(arrList);

		System.out.println("Sorted : ");
		for (String arrayList : arrList) {
			System.out.println(arrayList);
		}
	}

	private static void searchElement(ArrayList<String> arrList, String str) {

		boolean flag = false;

		for (String arrayList : arrList) {

			if (arrayList.equals(str)) {
				System.out.println("Element " + str + " found");
				flag = true;
			}

		}

		if (!flag) {
			System.out.println("Element Not found");
		}
	}

	private static ArrayList<String> addList() {

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("abc");
		arrList.add("def");
		arrList.add("xyz");
		arrList.add("pqr");
		arrList.add("ghi");

		return arrList;

	}

}
