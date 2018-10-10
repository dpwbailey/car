public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    vehicleFrameType = vehicleChassis;
  }
  public String toString() {
  return "Vehicle Frame     : " + vehicleFrameType;
  }
  }

//A specialized method that creates an instance of a class. === Constructor?