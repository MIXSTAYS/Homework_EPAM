package t06.main.model;

public class AtomicBoat {
    private String boatStatus;
    private String engineStatus = "Atomic boat's engine was not created.";
    private Engine engine;
    private int rpm;

    public AtomicBoat() {
        boatStatus = "AtomicBoat without engine was made.";
    }

    public void addEngine() {
        this.engine = new Engine();
        boatStatus = "Boat is ready to go for a sail!";
    }
    public void engineRPM(int rpm) {
        if (engine != null) {
            this.rpm = rpm;
            if (rpm > 0) {
                boatStatus = "The boat lives Saint-Petersburg in five minutes! :)";
                engineStatus = "Chooh-Chooh-Chooh";
            } else {
                boatStatus = "Engine not started.";
                engineStatus = "...";
            }
        } else  {
            boatStatus = "Boat can't go for a sail without engine :(";
        }
    }

    public String getBoatStatus() {
        return boatStatus;
    }

    public String getEngineStatus() {
        return engineStatus;
    }

    public int getRPM() {
        return rpm;
    }

    public class Engine {
        Engine() {
            engineStatus = "Engine for a boat was made and installed!";
        }
    }
}
