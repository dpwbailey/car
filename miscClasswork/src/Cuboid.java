
public class Cuboid<T extends Number> {


  private T length;
  private T width;
  private T height;

  public Cuboid(T length, T width, T height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public Cuboid() {

  }

  public void setLength(T length) {
    this.length = length;
  }

  public void setWidth(T width) {
    this.width = width;
  }

  public void setHeight(T height) {
    this.height = height;
  }


  public T getLength() {
    return length;
  }

  public T getWidth() {
    return width;
  }

  public T getHeight() {
    return height;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Cuboid{" +
        "length=" + length +
        ", width=" + width +
        ", height=" + height +
        '}';
  }

  public double getVolume(T length, T width, T height){
  return 1.0;
  }

  public static void main(String[] args) {
  //  Cuboid<Double> c1 = new Cuboid<>();
  //  Cuboid<String> c1 = new Cuboid<String>();
  }
}