package MTMfunction3;

public class Criteria {
    private int attributeId;
    private String attributeName;
    private String attributeDetail;
    private int priority;

    public void Criteria()
    {
        attributeId = 0;
        attributeName = "";
        attributeDetail = "";
        priority = 1;
    }

    public void Criteria(int id, String name, String detail, int pri)
    {
        attributeId = id;
        attributeName = name;
        attributeDetail = detail;
        priority = pri;
    }

    public int getAttributeId()
    {
        return attributeId;
    }

    public String getAttributeName()
    {
        return attributeName;
    }

    public String getAttributeDetail()
    {
        return attributeDetail;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setAttributeId(int id)
    {
        attributeId = id;
    }

    public void setAttributeName(String name)
    {
        attributeName = name;
    }

    public void setAttributeDetail(String detail)
    {
        attributeDetail = detail;
    }

    public void setPriority(int pri)
    {
        priority = pri;
    }
}
