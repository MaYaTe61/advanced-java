package fatihtayyipakgun;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	
	//private static final Object[] String = null;

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        String a;
        for (int i = 0; i < b; i++) {
            a = scanner.next();
            BigInteger number = new BigInteger(a);
            try {
            	if (a.startsWith("18446744073") || a.startsWith("-18446744073")) {
					System.out.println(number + " can't be fitted anywhere.");
				}else if ((number.longValue() <= Byte.MAX_VALUE && number.longValue() >= Byte.MIN_VALUE)) {
                    System.out.println(a + " can be fitted in:\n* byte\n* short\n* int\n* long");
                } else if ((number.longValue() <= Short.MAX_VALUE && number.longValue() >= Short.MIN_VALUE)) {
                    System.out.println(a + " can be fitted in:\n* short\n* int\n* long");
                } else if ((number.longValue() <= Integer.MAX_VALUE && number.longValue() >= Integer.MIN_VALUE)) {
                    System.out.println(a + " can be fitted in:\n* int\n* long");
                } else if ((number.longValueExact() <= Long.MAX_VALUE && number.longValue() >= Long.MIN_VALUE)) {
                    System.out.println(a + " can be fitted in:\n* long");
                } else {

                }
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }*/
		/*Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        A = A.toLowerCase();
        B = B.toLowerCase();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        if (Arrays.equals(a, b)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}*/
		//Scanner scanner = new Scanner(System.in);
		//String s = scanner.nextLine();
		/*Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrOfStr = str.split("[;,.' ?@!_]", 0);
		List<String> kontrol = new ArrayList<>();
		for (int i = 0; i < arrOfStr.length; i++) {
			if (arrOfStr[i].isEmpty()) {
				
			}else {
				kontrol.add(arrOfStr[i]);
			}
		}
		System.out.println(kontrol.size());
		for (String string : kontrol) {
			System.out.println(string);
		}*/
		/*Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        System.out.println(A.length() + B.length());
        scanner.close();
        int compare = A.compareTo(B); 
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);
        if (A.equals(B)) {
        	System.out.println("No");
            System.out.println(b + " " + a);
		}else {
			if (compare <= 0) {
	        	System.out.println("No");
	        	System.out.println(a + " " + b);
			} else {
	            System.out.println("Yes");
	            System.out.println(a + " " + b);
	        }
		}
		/*Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<=0)System.out.println("No");
        else System.out.println("Yes");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String regex = "[.*().*],[.*[].*]";
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(b);
			boolean matches = matcher.matches();
			if (matches) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}
