package user;

public class MissionCoordinator extends User {
    private String coordinatorId;
    private String coordinatorName;

    public MissionCoordinator(){

    }

    public String getCoordinatorId() {

        return coordinatorId;

    }

    public String getCoordinatorName() {

        return coordinatorName;

    }

    public void setCoordinatorId(String coordinatorId) {

        this.coordinatorId = coordinatorId;

    }

    public void setCoordinatorName(String coordinatorName) {

        this.coordinatorName = coordinatorName;

    }
}