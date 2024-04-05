package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new MediaPlayer();
    public NiceCar(){
        System.out.println("Shall I start the engine");
        engine = new ElectricEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void musicStart(){
        media.start();
    }
    public void musicStop(){
        media.stop();
    }
}
