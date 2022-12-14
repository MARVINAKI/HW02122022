import Other.MyException.WrongLoginException;
import Other.MyException.WrongPasswordException;
import Transport.Car;
import Other.User;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Car.CarType passengerCar = new Car.CarType("Легковой автомобиль");
        Car.CarType truck = new Car.CarType("Грузовой автомобиль");
        Car.CarType bus = new Car.CarType("Автобус");

        Car nissan = new Car("Nissan", "Terrano", 2);
        nissan.setCarType(passengerCar, Car.BodyTypePass.CROSSOVER);
        Car chevrolet = new Car("Chevrolet", "Cruze", 1.8);
        chevrolet.setCarType(passengerCar, Car.BodyTypePass.SEDAN);
        Car lada = new Car("LADA", "Priora", 1.6);
        lada.setCarType(passengerCar, Car.BodyTypePass.HATCHBACK);
        Car toyota = new Car("Toyota", "RAV4", 2);
        toyota.setCarType(passengerCar, Car.BodyTypePass.CROSSOVER);
        Car man = new Car("MAN", "TGS 6x6", 12.4);
        man.setCarType(truck, 12d);
        Car volvo = new Car("Volvo", "FE II", 7.2);
        volvo.setCarType(truck, Car.LoadCapacity.N2);
        Car kamaz = new Car("KAMAZ", "65659", 12);
        kamaz.setCarType(truck, Car.LoadCapacity.N3);
        Car maz = new Car("MAZ", "5440M9", 12.8);
        maz.setCarType(truck, Car.LoadCapacity.N3);
        Car nefaz = new Car("Nefaz", "5299", 6.7);
        nefaz.setCarType(bus, Car.PassCapacity.SMALL);
        Car gaz = new Car("GAZ", "A65R33-60", 2.7);
        gaz.setCarType(bus, Car.PassCapacity.MEDIUM);
        Car volvoBus = new Car("Volvo", "9500", 7.7);
        volvoBus.setCarType(bus, Car.PassCapacity.BIG);
        Car hyundai = new Car("Hyundai", "Universe", 12.3);
        hyundai.setCarType(bus, 120);


        Driver.DriversLicense categoryB = new Driver.DriversLicense("B");
        Driver.DriversLicense categoryC = new Driver.DriversLicense("C");
        Driver.DriversLicense categoryD = new Driver.DriversLicense("D");

        Driver kostya = new Driver("Иванов Константин Александрович", "да", 13);
        kostya.setDriversLicense(categoryB);
        Driver michael = new Driver("Michael Shumakher", " yes ", 40);
        michael.setDriversLicense(categoryB);
        Driver yurij = new Driver("Иванов Юрий Александрович", "да", 19);
        yurij.setDriversLicense(categoryB);
        Driver kvyat = new Driver("Daniil Kvyat", "yEs", 15);
        kvyat.setDriversLicense(categoryB);




        User user1 = new User("us1_ss", "11111111", " 1");

    }
}