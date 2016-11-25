package DailyForecastEntities;

public class Root
{
    private DailyForecasts[] DailyForecasts;

    private Headline Headline;

    public DailyForecasts[] getDailyForecasts ()
    {
        return DailyForecasts;
    }

    public void setDailyForecasts (DailyForecasts[] DailyForecasts)
    {
        this.DailyForecasts = DailyForecasts;
    }

    public Headline getHeadline ()
    {
        return Headline;
    }

    public void setHeadline (Headline Headline)
    {
        this.Headline = Headline;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DailyForecasts = "+DailyForecasts+", Headline = "+Headline+"]";
    }
}