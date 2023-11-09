public class main1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Thanh Tùng");
        person.setAge(23);
        person.setCountry("VietNam");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

