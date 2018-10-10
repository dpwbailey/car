import java.util.Calendar;
import java.util.Date;

public class ManufacturedEngine implements Engine {
  //private Calendar cal = Calendar.getInstance(); //used for date methods

  private String engineManufacturer;
  private Date engineManufacturedDate = new Date();
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;
  private Date Feb2 = new Date(12, 2, 2, 0, 55, 44);

  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drives";
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    engineType = fuel;
  }

  public String toString() {
    System.out.println("Engine Manufacturer : " + engineManufacturer);
    System.out.println("Engine Manufactured : " + engineManufacturedDate);
    System.out.println("Engine Make         : " + engineMake);
    System.out.println("Engine Model        : " + engineModel);
    System.out.println("Engine Type         : " + engineType);
    System.out.println("Engine Cylinders    : " + engineCylinders);
    System.out.println("Drive Train         : " + driveTrain);
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

}
