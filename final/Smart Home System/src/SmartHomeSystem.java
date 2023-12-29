// State interface
interface DeviceState {
    void transition();
}


// Concrete states for Lighting System
class OffState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Lighting System is off.");
    }
}

class DimState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Lighting System is dim.");
    }
}

class BrightState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Lighting System is bright.");
    }
}


// Concrete states for Thermostat
class CoolingState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Thermostat is cooling.");
    }
}

class HeatingState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Thermostat is heating.");
    }
}

class StandbyState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Thermostat is in standby.");
    }
}


// Concrete states for Security Camera
class IdleState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Security Camera is idle.");
    }
}

class RecordingState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Security Camera is recording.");
    }
}

class AlertState implements DeviceState {
    @Override
    public void transition() {
        System.out.println("Security Camera is in alert mode.");
    }
}


// Context class representing a device
class Device {
    private DeviceState currentState;

    public void setState(DeviceState state) {
        this.currentState = state;
    }

    public void performTransition() {
        currentState.transition();
    }
}


// Example of usage
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Example for the Lighting System
        Device lightingSystem = new Device();
        lightingSystem.setState(new DimState());
        lightingSystem.performTransition(); // Expected Output: Lighting System is dim.

        lightingSystem.setState(new BrightState());
        lightingSystem.performTransition(); // Expected Output: Lighting System is bright.

        // Example for the Thermostat
        Device thermostat = new Device();
        thermostat.setState(new CoolingState());
        thermostat.performTransition(); // Expected Output: Thermostat is cooling.

        thermostat.setState(new HeatingState());
        thermostat.performTransition(); // Expected Output: Thermostat is heating.

        // Example for the Security Camera
        Device securityCamera = new Device();
        securityCamera.setState(new IdleState());
        securityCamera.performTransition(); // Expected Output: Security Camera is idle.

        securityCamera.setState(new RecordingState());
        securityCamera.performTransition(); // Expected Output: Security Camera is recording.

        securityCamera.setState(new AlertState());
        securityCamera.performTransition(); // Expected Output: Security Camera is in alert mode.
    }
}
