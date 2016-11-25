package CityEntites;

/**
 * Created by Pawel on 25.11.2016.
 */
public class Country
{
    private String ID;

    private String LocalizedName;

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getLocalizedName ()
    {
        return LocalizedName;
    }

    public void setLocalizedName (String LocalizedName)
    {
        this.LocalizedName = LocalizedName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ID = "+ID+", LocalizedName = "+LocalizedName+"]";
    }
}
