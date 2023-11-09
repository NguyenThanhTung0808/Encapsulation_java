import java.time.Year;

public class main6 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCompany_name("CTY TNHH TMDV Thanh Tùng");
        car.setModel_name(" Tùng ");
        car.setYear(2023);

        String company_name = car.getCompany_name();
        String model_name = car.getModel_name();
        int year = car.getYear();
        double mileage = car.getMileage();

        System.out.println("company name :"+company_name);
        System.out.println("Name :" + model_name);
        System.out.println("Year :" + year);
        System.out.println("Mileage :" + mileage);

    }
}
