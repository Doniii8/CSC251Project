public class PolicyHolder {
    private int policyNum = 0, holderAge = 0;
    private double holderHeight = 0, holderWeight = 0;
    private String providerName = "", holderFirstName = "", holderLastName = "", holderSmokingStatus = ""; 
    public static int policyCount = 0;
    /**
       constructor that accepts arguments for each field
       @param pNum policy number
       @param pName provider name
       @param hFirstName holder first name
       @param hLastName holder last name
       @param hAge holder age
       @param hSmokingStatus holder smoker status
       @param hHeight holder height
       @param hWeight holder weight
     */
    public PolicyHolder(int pNum,String pName,String hFirstName,String hLastName,int hAge, String hSmokingStatus, double hHeight,double hWeight){
        policyNum = pNum;
        providerName = pName;
        holderFirstName = hFirstName;
        holderLastName = hLastName;
        holderAge = hAge;
        holderSmokingStatus = hSmokingStatus;
        holderHeight = hHeight;
        holderWeight = hWeight;
        policyCount ++;
    }

    //setters
    /**
       sets value for the policy number
       @param pNum
     */
    public void setPolicyNum(int pNum){
        policyNum = pNum;
    }

    /**
       sets value for the provider name
       @param pName
     */
    public void setProviderName(String pName){
        providerName = pName;
    }

    /**
       sets value for the holder's first name
       @param pName
     */
    public void setHolderFirstName(String hFirstName){
        holderFirstName = hFirstName;
    }

    /**
       sets value for the holder's last name
       @param pName
     */
    public void setHolderLastName(String hLastName){
        holderLastName = hLastName;
    }

    /**
       sets value for the holder's age
       @param pName
     */
    public void setHolderAge(int hAge){
        holderAge = hAge;
    }

    /**
       sets value for the holder's smoking status
       @param pName
     */
    public void setHolderSmokingStatus(String hSmokingStatus){
        holderSmokingStatus = hSmokingStatus;
    }

    /**
       sets value for the holder's height
       @param pName
     */
    public void setHolderHeight(double hHeight){
        holderHeight = hHeight;
    }

    /**
       sets value for the holder's weight
       @param pName
     */
    public void setHolderWeight(double hWeight){
        holderWeight = hWeight;
    }

    //getters 
    /**
       returns the policy number 
       @return policyNum
     */
    public int getPolicyNumber(){
    return policyNum;
    }

    /**
       returns the provider name
       @return policyNum
     */
    public String getProviderName(){
        return providerName;
    }

    /**
       returns the holder's first name
       @return policyNum
     */
    public String getHolderFirstName(){
    return holderFirstName;
    }

    /**
       returns the holder's last name
       @return policyNum
     */
    public String getHolderLastName(){
    return holderLastName;
    }

    /**
       returns the holder's age 
       @return policyNum
     */
    public int getHolderAge(){
    return holderAge;
    }

    /**
       returns the holder's smoking status 
       @return policyNum
     */
    public String getHolderSmokingStatus(){
    return holderSmokingStatus;
    }

    /**
       returns the holder's height
       @return policyNum
     */
    public double getHolderHeight(){
    return holderHeight;
    }

    /**
       returns the holder's weight
       @return policyNum
     */
    public double getHolderWeight(){
    return holderWeight;
    }

    public String toString(){
        return "Policy number: " + policyNum + "\nProvider Name: " + providerName + "\nPolicyholder First Name: " 
        + holderFirstName + "\nPolicyholder Last Name: " + holderLastName + "\nPolicyholder's Age: " 
        + holderAge + "\nPolicyholder's Smoking Status (smoker/non-smoker): " + holderSmokingStatus + 
        "\nPolicyholder's Height: " + holderHeight + "\nPolicyholder's Weight: " + holderWeight + "\n";
    }
}
