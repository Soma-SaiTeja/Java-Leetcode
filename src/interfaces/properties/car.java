package interfaces.properties;

import java.sql.SQLOutput;

public class car implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
    public void stop(){
        System.out.println("Stopping the car");
    }
    public void play(){
        System.out.println("Playing Music");
    }
    public void pause(){
        System.out.println("Pausing Music");
    }
}
