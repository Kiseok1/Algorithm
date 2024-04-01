import java.util.*;
class Solution {
    public int solution(int[] array) {
      Arrays.sort(array);
		if(array.length==1) {
			return array[0];
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			if(map.get(array[i])!=null) {
				map.put(array[i], map.get(array[i])+1);
			} else {
				map.put(array[i], 1);
			}
		}
		System.out.println(map);
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		System.out.println("------value 내림차순------");
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		for(Integer key : keySetList) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
		}
		System.out.println(keySetList.toString());
		if(map.size()!=1 && map.get(keySetList.get(0))==map.get(keySetList.get(1))) {
			return -1;
		} 
		return keySetList.get(0);
    }
}