package MTMfunction3;

public class Message {
    private int messageId;
    private int recruitmentId;
    private String content;

    public void Message()
    {
        messageId = 0;
        recruitmentId = 0;
        content = "1";
    }

    public void Message(int id, int id2, String con)
    {
        messageId = id;
        recruitmentId = id2;
        content = con;
    }

    public int getMessageId()
    {
        return messageId;
    }

    public int getRecruitmentId()
    {
        return recruitmentId;
    }

    public String getContent()
    {
        return content;
    }

    public void setMessageId(int id1)
    {
        messageId = id1;
    }

    public void setRecruitmentId(int recID)
    {
        recruitmentId = recID;
    }

    public void setContent(String con)
    {
        content = con;
    }
}
