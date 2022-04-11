
package lab;


public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.setName("Ahmed");
        s1.setGender("M");
        s1.setAge(21);
        s1.setKulliyyah("Kict");
        s1.setCgpa(3.67);
        s1.setAddress("Mahallah Bilal");
        
        System.out.println("\tStudent 1");
        System.out.println("Name: " + s1.getName());
        System.out.println("Gender: " + s1.getGender());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Kulliyyah: " + s1.getKulliyyah());
        System.out.println("CGPA: " + s1.getName());
        System.out.println("Address " + s1.getAddress());
        System.out.println();
        
        Student s2 = new Student();
        
        s2.setName("Asif");
        s2.setGender("M");
        s2.setAge(22);
        s2.setKulliyyah("Kict");
        s2.setCgpa(4.00);
        s2.setAddress("Mahallah Faruk");
        
        System.out.println("\tStudent 2");
        System.out.println("Name: " + s2.getName());
        System.out.println("Gender: " + s2.getGender());
        System.out.println("Age: " + s2.getAge());
        System.out.println("Kulliyyah: " + s2.getKulliyyah());
        System.out.println("CGPA: " + s2.getName());
        System.out.println("Address " + s2.getAddress());
        
    }
    
}
