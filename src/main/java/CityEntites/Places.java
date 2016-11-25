package CityEntites;

/**
 * Created by Pawel on 25.11.2016.
 */
public class Places
{
    private String Key;

    private String Rank;

    private String Type;

    private AdministrativeArea AdministrativeArea;

    private String LocalizedName;

    private Country Country;

    private String Version;

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    public String getRank ()
    {
        return Rank;
    }

    public void setRank (String Rank)
    {
        this.Rank = Rank;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public AdministrativeArea getAdministrativeArea ()
    {
        return AdministrativeArea;
    }

    public void setAdministrativeArea (AdministrativeArea AdministrativeArea)
    {
        this.AdministrativeArea = AdministrativeArea;
    }

    public String getLocalizedName ()
    {
        return LocalizedName;
    }

    public void setLocalizedName (String LocalizedName)
    {
        this.LocalizedName = LocalizedName;
    }

    public Country getCountry ()
    {
        return Country;
    }

    public void setCountry (Country Country)
    {
        this.Country = Country;
    }

    public String getVersion ()
    {
        return Version;
    }

    public void setVersion (String Version)
    {
        this.Version = Version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Key = "+Key+", Rank = "+Rank+", Type = "+Type+", AdministrativeArea = "+AdministrativeArea+", LocalizedName = "+LocalizedName+", Country = "+Country+", Version = "+Version+"]";
    }
}
