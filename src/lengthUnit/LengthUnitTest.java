package lengthUnit;


public interface LengthUnitTest {


    static void main(String[] args) {

        float kmLength = 0.3f;
        float inchLength = 100;
        float footLength = 200;
        float cmLength = 1;
        float dmLength=50;

        convertToMetters(kmLength, LengthUnit.KM);
        convertToMetters(dmLength, LengthUnit.DM);
        convertToMetters(inchLength, LengthUnit.INCH);
        convertToMetters(footLength, LengthUnit.FOOT);
        convertToMetters(cmLength, LengthUnit.CENTIMETER);
        convertToMetters(kmLength, LengthUnit.METER);
        convertToCentimetters(dmLength,LengthUnit.DM);
    }

    static void convertToMetters(float length, LengthUnit lengthUnit) {
        float conversion = lengthUnit.toMeter(length);
        System.out.println(length + " " + lengthUnit + " = " + conversion + " M");
    }

    static void convertToCentimetters(float length, LengthUnit lengthUnit) {
        float conversion = lengthUnit.toCentimerter(length);
        System.out.println(length + " " + lengthUnit + " = " + conversion + "CM");
    }
}

