package src;

import java.util.List;

class AfterEvery implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		
		for(int i = 0; i < list.size();i++) {
			
			list.set(i, list.get(i) + " \n");
			
		}
		
		
		return list.toString();
	}

}
