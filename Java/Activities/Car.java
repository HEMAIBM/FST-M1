public class Car {

    String model;
    int speed;
    String color;
public Car (String model, int speed, String color){
    this.model=model;
    this.color=color;
    this.speed=speed;

}
public void DisplaySpeed(){
    System.out.println("Car speed is " + this.speed);
}
}
