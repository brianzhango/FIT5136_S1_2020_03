public class Criteria {

    private String attributeName;
    private String attributeDetail;
    private int priority;

    public Criteria()
    {
        attributeName = "";
        attributeDetail = "";
        priority = 1;
    }

    public Criteria(String name, String detail, int pri)
    {
        attributeName = name;
        attributeDetail = detail;
        priority = pri;
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
