package advanced_DataStructures;

import java.util.HashMap;
import java.util.LinkedList;

public class DataStructuree {

	public static void main(String[] args) {
		LinkedList<Integer> lstObj = new LinkedList<>();
		lstObj.add(1);
		lstObj.add(2);
		lstObj.add(3);
		lstObj.add(4);
		lstObj.add(5);
		lstObj.add(6);
		lstObj.add(7);
		
		LinkedList<Integer> lstObj1 = new LinkedList<>();
		lstObj1.add(1);
		lstObj1.add(2);
		lstObj1.add(3);
		lstObj1.add(4);
		lstObj1.add(5);
		lstObj1.add(6);
		lstObj1.add(7);
	//	System.out.println(lstObj);
		
		LinkedList<LinkedList<Integer>> lstObject = new LinkedList<>();
lstObject.add(lstObj);
lstObject.add(lstObj1);
lstObject.add(lstObj);
lstObject.add(lstObj);
System.out.println(lstObject);




		HashMap<String,Integer> hmap1 = new HashMap<>();

		hmap1.put("Test1", 123456);
		hmap1.put("Test2", 123456);
		hmap1.put("Test3", 123456);
		hmap1.put("Test4", 123456);
		hmap1.put("Test5", 123456);
		
		
		HashMap<String,Integer> hmap2 = new HashMap<>();
		
		hmap2.put("Test2.1", 12345);
		hmap2.put("Test2.2", 12345);
		hmap2.put("Test2.3", 12345);
		hmap2.put("Test2.4", 12345);
		hmap2.put("Test2.5", 12345);
		
		
		LinkedList<HashMap<String,Integer>> lstSchoolObj = new LinkedList<>();
		
		lstSchoolObj.add(hmap1);
		lstSchoolObj.add(hmap2);
		
		
		System.out.println(lstSchoolObj);
		
		
		
		
		LinkedList<HashMap<String,Integer>> lstSchl = new LinkedList<>(lstSchoolObj);
		
		
		
		
		for (int i = 0; i < lstSchl.size(); i++) {
			HashMap<String,Integer> hMapSchool = lstSchl.get(i);
			
			System.out.println(hMapSchool.get("Test1"));
			System.out.println(hMapSchool.get("Test2.1"));
		}
		
		
		
		LinkedList<College> lstCollege = new LinkedList<>();

		
		College college1 = new College();
		
		college1.setId(1);
		college1.setName("Narayana");
		college1.setContactNo(123456);
		college1.setAddress("Nellore");
		college1.setPincode(612);
		
		
College college2 = new College();
		
		college2.setId(2);
		college2.setName("Chaithanya");
		college2.setContactNo(123465);
		college2.setAddress("Tirupathi");
		college2.setPincode(517);
		
College college3 = new College();
		
		college3.setId(3);
		college3.setName("NRI");
		college3.setContactNo(123478);
		college3.setAddress("Kurnool");
		college3.setPincode(472);
		
		
		
		lstCollege.add(college1);
		lstCollege.add(college2);
		lstCollege.add(college3);
		
		
		System.out.println(lstCollege);
		
//mandal-1		
//mandal-1		
//mandal-1		
//mandal-1		
		LinkedList<College> lstCollege1  = new LinkedList<>(lstCollege);
		

		for (int i = 0; i < lstCollege1.size(); i++) {
			College college = lstCollege1.get(i);
			if (college.getName().equalsIgnoreCase("chaithanya")) {
				System.out.println(college);
				System.out.println(college.getAddress());
				break;
			}
		}
		
		

		
		
		HashMap<String,Integer> pradeep = new HashMap<>();
		pradeep.put("rrr", 123456);
		pradeep.put("aaa", 12345);
		pradeep.put("cc", 1234);
		
		//System.out.println(pradeep);
		
		
		
		
		LinkedList<HashMap<String,Integer>> hash = new LinkedList<>();
		
		hash.add(pradeep);
		
		
		//System.out.println(hash);
		
		
		
		
		
		
		HashMap<String,HashMap<String,Integer>> hashmap = new HashMap<>();
		
		HashMap<String,Integer> prasad = new HashMap<>();
		prasad.put("yeswanth", 2);
		prasad.put("nikhil", 1);
		prasad.put("rasool", 3);
		
		HashMap<String,Integer> pra = new HashMap<>();
		pra.put("prasad", 5);
		pra.put("omkar", 4);
		pra.put("rakesh", 6);
		
		
		hashmap.put("pradeep",prasad );
		
		hashmap.put("prasad",pra );
		System.out.println(hashmap);

		
		HashMap<String,HashMap<String,Integer>> hashmapNew = new HashMap<>(hashmap);
		
		
		System.out.println(hashmapNew);
		
	     if (hashmapNew.containsKey("pradeep")) {
	           
	            HashMap<String, Integer> Map = hashmapNew.get("pradeep");
	            
	            	 if (Map.containsKey("rasool")) {
	            	
	            	int val=Map.get("rasool");
	            	
	            	
	            	
	                System.out.println("pradeep contains rasool contact.");
	                System.out.println(val);
	                
	                
	            } else {
	                System.out.println("pradeep dont have rasool contact");
	            }
	        } else {
	            System.out.println("pradeep is not present in the  HashMap.");
	        }
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
