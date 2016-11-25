package DailyForecastEntities;

public class Temperature
{
    private Maximum Maximum;

    private Minimum Minimum;

    public Maximum getMaximum ()
    {
        return Maximum;
    }

    public void setMaximum (Maximum Maximum)
    {
        this.Maximum = Maximum;
    }

    public Minimum getMinimum ()
    {
        return Minimum;
    }

    public void setMinimum (Minimum Minimum)
    {
        this.Minimum = Minimum;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Maximum = "+Maximum+", Minimum = "+Minimum+"]";
    }
}
