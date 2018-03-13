package t06.main.test;

import org.junit.Before;
import org.junit.Test;
import t06.main.model.AtomicBoat;

import static org.junit.Assert.assertEquals;
public class AtomicBoatTest {
    private AtomicBoat testedBoat;

    @Before
    public void setUp() {
        testedBoat = new AtomicBoat();
    }

    @Test
    public void getBoatStatusShouldReturnMessageAboutMissingEngine() {
        assertEquals("AtomicBoat without engine was made.", testedBoat.getBoatStatus());
        testedBoat.engineRPM(1200);
        assertEquals("Boat can't go for a sail without engine :(", testedBoat.getBoatStatus());
    }

    @Test
    public void getBoatStatusShouldReturnMessageAboutPresenceOfEngine() {
        testedBoat.addEngine();
        assertEquals("Boat is ready to go for a sail!", testedBoat.getBoatStatus());
        testedBoat.engineRPM(1200);
        assertEquals("The boat lives Saint-Petersburg in five minutes! :)", testedBoat.getBoatStatus());
        testedBoat.engineRPM(0);
        assertEquals("Engine not started.", testedBoat.getBoatStatus());
    }
}
