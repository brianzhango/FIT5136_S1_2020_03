import java.util.*;
/**
 *Job required for a mission
 * 
 *Dongheng Zhan
 *18/05/2020
 */
public class Job
{
   
    private String jobName;
    private String jobDescription;

    
    public Job()
    {
       jobName = "";
       jobDescription = "";
    }

    public Job(String jobName, String jobDescription) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }
}
