import java.util.*;
/**
 * Employment for job
 *
 * Dongheng Zhan
 * 18/05/2020
 */
public class Employment
{
    private String title;
    private int numberForEachJob;

    public Employment()
    {
        title = "";
        numberForEachJob = 0;
    }

    public Employment(String title, int numberForEachJob) {
        this.title = title;
        this.numberForEachJob = numberForEachJob;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberForEachJob(int numberForEachJob) {
        this.numberForEachJob = numberForEachJob;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberForEachJob() {
        return numberForEachJob;
    }
}
