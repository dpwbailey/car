public class VehicleChassis implements Chassis {

  private String chassisName;

  public VehicleChassis() {
    chassisName = chassis;
  }
  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }
  public Chassis getChassisType(){
    return this;
  }
  public void setChassisType(String vehicleChassis){
    chassisName = vehicleChassis;
  }
  public String toString(){
    return "Chassis Name      : " + chassisName;
  }

}
