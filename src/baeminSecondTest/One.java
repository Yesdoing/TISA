package baeminSecondTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class One {
	public static final String NEWLINE = System.getProperty("line.separator");

	public static void main(String[] args) {
		String test = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" + "john.png, London, 2015-06-20 15:13:22\n"
				+ "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" + "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"
				+ "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" + "BOB.jpg, London, 2015-08-05 00:02:03\n"
				+ "notredame.png, Paris, 2015-09-01 12:00:00\n" + "me.jpg, Warsaw, 2013-09-06 15:40:22\n"
				+ "a.png, Warsaw, 2016-02-13 13:33:50\n" + "b.jpg, Warsaw, 2016-01-02 15:12:22\n"
				+ "c.jpg, Warsaw, 2016-01-02 14:34:30\n" + "d.jpg, Warsaw, 2016-01-02 15:15:01\n"
				+ "e.png, Warsaw, 2016-01-02 09:49:09\n" + "f.png, Warsaw, 2016-01-02 10:55:32\n"
				+ "g.jpg, Warsaw, 2016-02-29 22:13:11";
		String s = "photo.jpg, Warsaw, 2013-09-05 14:08:15";
		System.out.println(solution(test));
	}

	public static String solution(String s) {
		String[] splitline = s.split(NEWLINE);
		HashMap<String, ArrayList<String>> splitcity = new HashMap<>();
		for (int i = 0; i < splitline.length; i++) {
			String[] temp = splitline[i].split(", ");
			if (splitcity.containsKey(temp[1])) {
				splitcity.get(temp[1]).add(splitline[i]);
			} else {
				ArrayList<String> city = new ArrayList<>();
				city.add(splitline[i]);
				splitcity.put(temp[1], city);
			}
		}

		for (String key : splitcity.keySet()) {
			ArrayList<String> temp = splitcity.get(key);

			Collections.sort(temp, new Comparator<String>() {
				DateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

				@Override
				public int compare(String o1, String o2) {
					try {
						return f.parse(o1.split(", ")[2]).compareTo(f.parse(o2.split(", ")[2]));
					} catch (ParseException e) {
						throw new IllegalArgumentException(e);
					}
				}
			});

			int num = 0;
			int num2 = 1;

			int i = 0;
			for (String str : temp) {
				String[] str2 = str.split(", ");

				if (temp.size() >= 10) {
					str2[0] = str2[1] + num + num2;
				} else {
					str2[0] = str2[1] + num2;
				}

				num2++;

				if (num2 > 9) {
					num++;
					num2 = 0;
				}
				
				temp.set(i, str2[0] + ", " + str2[1] + ", " + str2[2]);
				i++;
			}
			splitcity.replace(key, temp);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String ss : splitline ) {
			String[] temp = ss.split(", ");
			for(String sss : splitcity.get(temp[1])) {
				if(sss.contains(temp[2])) {
					sb.append(sss.split(", " )[0] + temp[0].substring(temp[0].length()-4));
					sb.append(NEWLINE);
				}
			}
		}
		
		return sb.toString();
	}
}
