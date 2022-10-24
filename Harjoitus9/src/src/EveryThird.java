package src;

import java.util.List;

public class EveryThird implements ListConverter {

	@Override
	public String listToString(List<String> list) {

		String s = "";
		int i = 0;
		for (String t : list) {
			if ((i + 1) % 3 == 0) {
				s += t + " \n";
			} else if((i + 1) % 3 != 0){
				s += t;
			}
			i++;
		}
		return s;
	}

}
