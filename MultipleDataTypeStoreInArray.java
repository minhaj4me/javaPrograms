class MultipleDataTypeStoreInArray {
    public static void main(String[] args) {
        System.out.println("Array Definition :- ");
        System.out.println(
                "An Array is an Object consisting of a numbered list of variables. Each is a primitive type or reference\n\n");

        System.out.println("if we want to store different type of data type in a single unit in an array");
        System.out.println("then we have to create an array of object ");
        System.out.println("then we can store any kind of object we want in the references in the array");
        System.out.println("We can store primitive tyep and object type in the same array");
        System.out.println("We have create two different object and its references\n");

        // primitive type

        Object[] o1 = new Object[4];
        o1[0] = 'a';
        o1[1] = 1;
        o1[2] = 1.2;
        o1[3] = false;
        System.out.println("This is storing primitive type " + o1[0] + " " + o1[1] + " " + o1[2] + " " + o1[3]);

        System.out.println();

        // Object type

        Object[] o2 = new Object[4];
        o2[0] = o1;
        o2[1] = "ok";
        // o1[2]= ENUM
        // o2[3]=Interface;
        System.out.println("This is storing Object type " + o2[0] + " " + o2[1]/* +" "+o1[2]+" "+o1[3] */);

    }
}