package lab1.exemple;

class DataOnly {
    int i;
    float f;
    boolean b;
    String s;
}

class PropertiesExample {
    String myString;

    String getMyString() {
        return myString;
    }

    void setMyString(String s) {
        myString = s;
    }
}

class Main {
    public static void main(String[] args) {
        //---- exemplu 1 ----
        DataOnly d = new DataOnly();

        // set the field i to the value 1
        d.i = 1;

        // use that value
        System.out.println("Field i of the object d is " + d.i);


        //---- exemplu 2 ----
        PropertiesExample pe = new PropertiesExample();
        pe.setMyString("This is my string!");
        System.out.println(pe.myString);

        //---- exemplu 3 ----
        String s1, s2;

        s1 = "My first string";
        s2 = "My second string";

        System.out.println(s1.length());
        System.out.println(s2.length());
    }
}
