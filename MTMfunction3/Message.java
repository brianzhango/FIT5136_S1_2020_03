package MTMfunction3;

public class Message {
    private int messageId;
    private int recruitmentId;
    private String content;

    public void Criteria()
    {
        messageId = 0;
        recruitmentId = 0;
        content = "";
    }

    public void Criteria(int id, int id2, String con)
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
}
