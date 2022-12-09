package Collection.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryCapital{
 HashMap<String, String> M1=new HashMap<String, String>();
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String retriveCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String retriveCountry(String capitalName) {
		Set<java.util.Map.Entry<String,String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<java.util.Map.Entry<String,String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<java.util.Map.Entry<String,String>> set = M1.entrySet();
		Iterator<java.util.Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	 public static void main(String[] args) {
		 CountryCapital cMap = new CountryCapital();

			cMap.storeCountryCapital("India", "Delhi");
			cMap.storeCountryCapital("Japan", "Tokyo");
			cMap.storeCountryCapital("USA", "Washington, D.C.");
			
			System.out.println(cMap.retriveCapital("India"));
			System.out.println(cMap.retriveCountry("Tokyo"));
			System.out.println(cMap.toArrayList());
			
			HashMap<String, String> M2 = CountryCapital.KyeValuesswaping();
			System.out.println(M2);
		}

	private static HashMap<String, String> KyeValuesswaping() {
		// TODO Auto-generated method stub
		return null;
	}
}