package lengthUnit;


public interface LengthUnitTest {


    static void main(String[] args) {

        float kmLength = 0.3f;
        float cmLength = 1;
        float dmLength=50;

        convertToMeters(kmLength, LengthUnit.KM);
        convertToMeters(dmLength, LengthUnit.DM);
        convertToMeters(cmLength, LengthUnit.CM);
        convertToMeters(kmLength, LengthUnit.METER);
        convertToCentimeters(dmLength,LengthUnit.DM);
        convertToMilimeters(cmLength,LengthUnit.CM);
        convertToMilimeters(dmLength,LengthUnit.DM);
    }

    static void convertToMeters(float length, LengthUnit lengthUnit) {
        float conversion = lengthUnit.toMeter(length);
        System.out.println(length + " " + lengthUnit + " = " + conversion + " M");
    }

    static void convertToCentimeters(float length, LengthUnit lengthUnit) {
        float conversion = lengthUnit.toCentimeter(length);
        System.out.println(length + " " + lengthUnit + " = " + conversion + "CM");
    }

    static void convertToMilimeters(float length, LengthUnit lengthUnit) {
        float conversion = lengthUnit.toMilimeter(length);
        System.out.println(length + " " + lengthUnit + " = " + conversion + "MM");
    }
}