public class StringDemo {
    public static void main(String[] args) 
	{
		String name=new String();
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.concat("testing"));

        String name1 ="s1";
        name1 +="s2";
        System.out.println(name1);

        String s1 = "XYZ";
        String s2 = "XYZ";

        System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.compareToIgnoreCase(s2));
        // System.out.println(s1.compareTo(s2) == 0);
        // System.out.println(s1.compareToIgnoreCase(s2) == 0);
        // System.out.println(s1.compareTo(s2) == s1.compareToIgnoreCase(s2));
        // System.out.println(s1.compareToIgnoreCase(s2) == s1.compareToIgnoreCase(s2));
        // System.out.println(s1.compareToIgnoreCase(s2) == s1.compareToIgnoreCase(s2));
    }
}
