interface SensorReadable {
    void readSensorData();
}

abstract class IrrigationUnit implements SensorReadable {
    private String unitId;
    protected double waterFlowRate;

    public IrrigationUnit(String unitId, double waterFlowRate) {
        this.unitId = unitId;
        this.waterFlowRate = waterFlowRate;
    }

    public abstract void startWatering();

    protected final void calibrateSystem() {
        System.out.println(unitId + " calibration done.");
    }

    public String getUnitId() {
        return unitId;
    }
}

class Sprinkler extends IrrigationUnit {
    public Sprinkler(String unitId) {
        super(unitId, 5.0);
    }

    @Override
    public void startWatering() {
        calibrateSystem();
        System.out.println("Sprinkler " + getUnitId() + " is watering with " + waterFlowRate + " L/min.");
    }

    @Override
    public void readSensorData() {
        System.out.println("Sprinkler " + getUnitId() + " reads temperature and soil moisture.");
    }
}

class DripSystem extends IrrigationUnit {
    public DripSystem(String unitId) {
        super(unitId, 1.5);
    }

    @Override
    public void startWatering() {
        calibrateSystem();
        System.out.println("DripSystem " + getUnitId() + " is watering with " + waterFlowRate + " L/min.");
    }

    @Override
    public void readSensorData() {
        System.out.println("DripSystem " + getUnitId() + " reads soil pH and moisture.");
    }
}

public class AgricultureApp {
    public static void main(String[] args) {
        IrrigationUnit sprinkler = new Sprinkler("SP-101");
        IrrigationUnit dripSystem = new DripSystem("DS-202");

        sprinkler.readSensorData();
        sprinkler.startWatering();

        dripSystem.readSensorData();
        dripSystem.startWatering();
    }
}


