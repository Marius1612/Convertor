package lengthUnit;

public enum LengthUnit {

    METER(1),

    INCH(0.025f),

    CENTIMETER(0.01f),

    FOOT(0.3f),

    KM(1000),

    DM(0.1f);

    private float conversionFactor;

    LengthUnit(float conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public float toMeter(float length) {
        return length * conversionFactor;
    }

    public float toCentimerter(float length)
    {
        return length * 100f * conversionFactor;
    }
}