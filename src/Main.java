import java.util.Date;

public class Main extends ManufacturedEngine {



  public static void main(String[] args) {

    private Date manufacturedDateJan = new Date(12, 1, 2, 7, 13, 19);

    VehicleChassis myVC = new VehicleChassis();
    VehicleFrame myVF = new VehicleFrame();
    VehicleFrame myVFtwo = new VehicleFrame("Ladder Frame");
    VehicleChassis myVCtwo = new VehicleChassis("Chaz");
    myVCtwo.getChassisType();
    //  System.out.println(myVC.toString());
    myVC.setChassisType("chazzz");
    // System.out.println(myVC.toString());
    //  System.out.println(myVC.getChassisType());
    //   System.out.println(myVCtwo.toString());
    //   System.out.println(myVF);
    // System.out.println(myVFtwo);
    ManufacturedEngine engineOne = new ManufacturedEngine();
    ManufacturedEngine engineTwo = new ManufacturedEngine("Generic", manufacturedDateJan,
        "Generic", "H23A1", 4 , "88 AKI ",
        "2WD: Two-Wheel Drive ");
  }
}
