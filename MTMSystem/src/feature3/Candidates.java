package feature3;


import user.User;

public class Candidates extends User {
    private String candidateId;
    private String name;
    private String dateOfBirth;
    private String address;
    private String identificationNumber;
    private String gender;
    private String allergies;
    private String foodPreferences;
    private String qualifications;
    private String workExperience;
    private String occupations;
    private String computerSkills;
    private String languagesSpoken;
    private String healthRecord;


    public Candidates(){
        super();

    }

    public Candidates(String candidateId, String name, String dateOfBirth, String address, String identificationNumber, String gender, String allergies, String foodPreferences, String qualifications, String workExperience, String occupations, String computerSkills, String languagesSpoken, String healthRecord) {
        super();
        this.candidateId = candidateId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.identificationNumber = identificationNumber;
        this.gender = gender;
        this.allergies = allergies;
        this.foodPreferences = foodPreferences;
        this.qualifications = qualifications;
        this.workExperience = workExperience;
        this.occupations = occupations;
        this.computerSkills = computerSkills;
        this.languagesSpoken = languagesSpoken;
        this.healthRecord = healthRecord;
    }

    public String getName() {

        return name;

    }

    public String getDateOfBirth() {

        return dateOfBirth;

    }

    public String getAddress() {

        return address;

    }

    public String getIdentificationNumber() {

        return identificationNumber;

    }

    public String getGender() {

        return gender;

    }

    public String getAllergies() {

        return allergies;

    }

    public String getFoodPreferences() {

        return foodPreferences;

    }

    public String getQualifications() {

        return qualifications;

    }

    public String getWorkExperience() {

        return workExperience;

    }

    public String getOccupations() {

        return occupations;

    }

    public String getComputerSkills() {

        return computerSkills;

    }

    public String getLanguagesSpoken() {

        return languagesSpoken;

    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public String getCandidateId() {

        return candidateId;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void setIdentificationNumber(String identificationNumber) {

        this.identificationNumber = identificationNumber;

    }

    public void setGender(String gender) {

        this.gender = gender;

    }

    public void setAllergies(String allergies) {

        this.allergies = allergies;

    }

    public void setFoodPreferences(String foodPreferences) {

        this.foodPreferences = foodPreferences;

    }

    public void setQualifications(String qualifications) {

        this.qualifications = qualifications;

    }

    public void setWorkExperience(String workExperience) {

        this.workExperience = workExperience;

    }

    public void setOccupations(String occupations) {

        this.occupations = occupations;

    }

    public void setComputerSkills(String computerSkills) {

        this.computerSkills = computerSkills;

    }

    public void setLanguagesSpoken(String languagesSpoken) {

        this.languagesSpoken = languagesSpoken;

    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }

    public void setCandidateId(String candidateId) {

        this.candidateId = candidateId;

    }

    public int getAge(){
        int a = 0;
        a = Integer.parseInt(dateOfBirth.substring(dateOfBirth.length()-4));
        return 2020-a;
    }
}