public class StringChange {
    static String pdetail="Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
    public static void main(String[] args)
    {System.out.println(pdetail.replaceAll(" ", ""));//remove spaces
        System.out.println( pdetail. replaceAll("[0-9]",""));//remove numbers
        System.out.println(pdetail. replaceAll("[^0-9]","")); //Exctract number
        System.out.println(pdetail.replaceAll("Java","")); //remove java word
        System.out.println(pdetail.replaceAll("[^a-zA-Z0-9]","  ")); //remove spaceal character
        System.out.println(pdetail.toUpperCase()); //convert uppercase all string
        System.out.println(pdetail.toLowerCase()); //convert lowercase all string
        System.out.println(pdetail.length()); //find length of string
        System.out.println(pdetail.indexOf('P')); // find index of P
        System.out.println(pdetail.replaceAll("Patel's","")); //remove patel's word
    }}


