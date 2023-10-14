import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class tests {

    Car car = new Car("Toyata", "Camry", 2022);
    Motorcycle moto = new Motorcycle("Suzyki", "Blablabla", 2021);

    // тест, что экземпляр Car также является экземпляром транспортного средства;
    // (instanceof)
    @Test
    void instanceOf() {
        // Car car = new Car("Toyata", "Camry", 2022);
        assertThat(car instanceof Vehicle);
    }

    // - тест, что Car создается с 4-мя колесами
    @Test
    void WheelsCar() {
        // Car car = new Car("Toyata", "Camry", 2022);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - тест, что Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleWheels() {
        // Motorcycle moto = new Motorcycle("Suzyki", "Blablabla", 2021);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    // - тест, что Car развивает скорость 60 в режиме тестового вождения
    // (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // - тест, что объект Motorcycle развивает скорость 75 в режиме тестового
    // вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    // - тест, что машина в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void parkCar() {
        car.testDrive();
        // System.out.println(car.getSpeed());
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // - тест, что мотоцикл в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}