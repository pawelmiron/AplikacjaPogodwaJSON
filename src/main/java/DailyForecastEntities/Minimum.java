package DailyForecastEntities;

public class Minimum
{
    private String Value;

    private String UnitType;

    private String Unit;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getUnitType ()
    {
        return UnitType;
    }

    public void setUnitType (String UnitType)
    {
        this.UnitType = UnitType;
    }

    public String getUnit ()
    {
        return Unit;
    }

    public void setUnit (String Unit)
    {
        this.Unit = Unit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", UnitType = "+UnitType+", Unit = "+Unit+"]";
    }
}