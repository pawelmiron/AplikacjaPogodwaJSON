package DailyForecastEntities;

public class Headline
{
    private String Text;

    private String Category;

    private String Link;

    private String EndDate;

    private String Severity;

    private String MobileLink;

    private String EndEpochDate;

    private String EffectiveDate;

    private String EffectiveEpochDate;

    public String getText ()
    {
        return Text;
    }

    public void setText (String Text)
    {
        this.Text = Text;
    }

    public String getCategory ()
    {
        return Category;
    }

    public void setCategory (String Category)
    {
        this.Category = Category;
    }

    public String getLink ()
    {
        return Link;
    }

    public void setLink (String Link)
    {
        this.Link = Link;
    }

    public String getEndDate ()
    {
        return EndDate;
    }

    public void setEndDate (String EndDate)
    {
        this.EndDate = EndDate;
    }

    public String getSeverity ()
    {
        return Severity;
    }

    public void setSeverity (String Severity)
    {
        this.Severity = Severity;
    }

    public String getMobileLink ()
    {
        return MobileLink;
    }

    public void setMobileLink (String MobileLink)
    {
        this.MobileLink = MobileLink;
    }

    public String getEndEpochDate ()
    {
        return EndEpochDate;
    }

    public void setEndEpochDate (String EndEpochDate)
    {
        this.EndEpochDate = EndEpochDate;
    }

    public String getEffectiveDate ()
    {
        return EffectiveDate;
    }

    public void setEffectiveDate (String EffectiveDate)
    {
        this.EffectiveDate = EffectiveDate;
    }

    public String getEffectiveEpochDate ()
    {
        return EffectiveEpochDate;
    }

    public void setEffectiveEpochDate (String EffectiveEpochDate)
    {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Text = "+Text+", Category = "+Category+", Link = "+Link+", EndDate = "+EndDate+", Severity = "+Severity+", MobileLink = "+MobileLink+", EndEpochDate = "+EndEpochDate+", EffectiveDate = "+EffectiveDate+", EffectiveEpochDate = "+EffectiveEpochDate+"]";
    }
}