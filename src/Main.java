public class Main {

    public static void main(String[] args) {
        getSandwich("chlebjajkochleb");
    }
    public static String getSandwich (String s){

        int a= s.indexOf("chleb");
        int b=  s.lastIndexOf("chleb");
        if (a<b){ String c = s.substring(a+5, b);
            System.out.println(c);
            return c;}
        else return " ";


    }
}
