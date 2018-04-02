package lecture;

public class SphereVolumeCalculator {
   public static void main (String [] args) {
      double piVal = Math.PI;
      double sphereVolume;
      double sphereRadius;

      sphereRadius = 1.0;

      sphereVolume = (4.0 / 3.0) * piVal * sphereRadius * sphereRadius *sphereRadius;

      System.out.println("Sphere volume: " + sphereVolume);
   }
}