package MTMfunction3;

public class Administrator {
    private int administratorId;
    private String administratorName;

    public void Administrator()
    {
        administratorId = 0;
        administratorName = "Justin";
    }

    public void Administrator(int id, String name)
    {
        administratorId = id;
        administratorName = name;
    }

    public int getAdminstratorId()
    {
        return administratorId;
    }

    public String getAdministratorName()
    {
        return administratorName;
    }

    public void setAdminstratorId(int id)
    {
        administratorId = id;
    }

    public void setAdministratorName(String name)
    {
        administratorName = name;
    }
}
