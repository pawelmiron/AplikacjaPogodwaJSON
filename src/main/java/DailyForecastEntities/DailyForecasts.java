package DailyForecastEntities;

public class DailyForecasts
{
    private String Link;

    private String Date;

    private String MobileLink;

    private Night Night;

    private Temperature Temperature;

    private String[] Sources;

    private String EpochDate;

    private Day Day;

    public String getLink ()
    {
        return Link;
    }

    public void setLink (String Link)
    {
        this.Link = Link;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public String getMobileLink ()
    {
        return MobileLink;
    }

    public void setMobileLink (String MobileLink)
    {
        this.MobileLink = MobileLink;
    }

    public Night getNight ()
    {
        return Night;
    }

    public void setNight (Night Night)
    {
        this.Night = Night;
    }

    public Temperature getTemperature ()
    {
        return Temperature;
    }

    public void setTemperature (Temperature Temperature)
    {
        this.Temperature = Temperature;
    }

    public String[] getSources ()
    {
        return Sources;
    }

    public void setSources (String[] Sources)
    {
        this.Sources = Sources;
    }

    public String getEpochDate ()
    {
        return EpochDate;
    }

    public void setEpochDate (String EpochDate)
    {
        this.EpochDate = EpochDate;
    }

    public Day getDay ()
    {
        return Day;
    }

    public void setDay (Day Day)
    {
        this.Day = Day;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Link = "+Link+", Date = "+Date+", MobileLink = "+MobileLink+", Night = "+Night+", Temperature = "+Temperature+", Sources = "+Sources+", EpochDate = "+EpochDate+", Day = "+Day+"]";
    }
}