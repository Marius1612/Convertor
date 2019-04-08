package lengthUnit;

public enum LengthUnit {

    METER(1),

    CM(0.01f),

    KM(1000),

    DM(0.1f),

    MM(0.001f);

    private float conversionFactor;

    LengthUnit(float conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public float toMeter(float length) {
        return length * conversionFactor;
    }

    public float toCentimeter(float length) {
        return length * 100 * conversionFactor;
    }

    public float toDecimeter(float length){return length*10*conversionFactor;}

    public float toMilimeter(float length){return length*1000*conversionFactor;}

}