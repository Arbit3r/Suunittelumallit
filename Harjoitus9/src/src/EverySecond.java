package src;

import java.util.List;

class EverySecond implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		// TODO Auto-generated method stub
		String lista[] = new String[list.size()];
		String tuloste = "";
		int i = 0;
		for (String a : list) {
			lista[i] = a;
			i++;
		}
		for (int i2 = 0; i2 < lista.length; i2++) {
			if ((i2 + 1) % 2 == 0) {
				tuloste += lista[i2] + "\n";
			}
			if ((i2 + 1) % 2 != 0) {
				tuloste += lista[i2];
			}
		}
		return tuloste;
	}

}
