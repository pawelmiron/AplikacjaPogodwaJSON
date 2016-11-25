package CityEntites;

/**
 * Created by Pawel on 25.11.2016.
 */
public class PlacesRoot
{
    private Places[] Places;

    public Places[] getPlaces ()
    {
        return Places;
    }

    public void setPlaces (Places[] Places)
    {
        this.Places = Places;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Places = "+Places+"]";
    }
}