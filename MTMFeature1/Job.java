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
    private ArrayList<Employment> emp;
    public Job()
    {
       jobName = "";
       jobDescription = "";
       emp = new ArrayList<Employment>();
    }

    public Job(String jobName, String jobDescription, ArrayList<Employment> emp) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.emp = emp;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setEMP(String title, int numberForEachJob)
    {
       Employment Emp;
       Emp = new Employment(title,numberForEachJob);
       emp.add(Emp);
    }
    
    public String getJobName() {
        return jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public ArrayList<Employment> getEmp() {
        return emp;
    }
}
