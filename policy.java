public class policy {
    private int policyNum = 0, holderAge = 0;
    private double holderHeight = 0, holderWeight = 0;
    private String providerName = "", holderFirstName = "", holderLastName = "", holderSmokingStatus = ""; 


    public policy(int pNum,String pName,String hFirstName,String hLastName,int hAge, String hSmokingStatus, double hHeight,double hWeight){
        policyNum = pNum;
        providerName = pName;
        holderFirstName = hFirstName;
        holderLastName = hLastName;
        holderAge = hAge;
        holderSmokingStatus = hSmokingStatus;
        holderHeight = hHeight;
        holderWeight = hWeight;
    }

    //setters
    public void setPolicyNum(int pNum){
        policyNum = pNum;
    }
    public void setProviderName(String pName){
        providerName = pName;
    }
    public void setHolderFirstName(String hFirstName){
        holderFirstName = hFirstName;
    }
    public void setHolderLastName(String hLastName){
        holderLastName = hLastName;
    }
    public void setHolderAge(int hAge){
        holderAge = hAge;
    }
    public void setHolderSmokingStatus(String hSmokingStatus){
        holderSmokingStatus = hSmokingStatus;
    }
    public void setHolderHeight(double hHeight){
        holderHeight = hHeight;
    }
    public void setHolderWeight(double hWeight){
        holderWeight = hWeight;
    }

    //getters 

    public int getPolicyNumber(){
    return policyNum;
    }

    public String getProviderName(){
        return providerName;
    }

    public String getHolderFirstName(){
    return holderFirstName;
    }

    public String getHolderLastName(){
    return holderLastName;
    }

    public int getHolderAge(){
    return holderAge;
    }

    public String getHolderSmokingStatus(){
    return holderSmokingStatus;
    }

    public double getHolderHeight(){
    return holderHeight;
    }

    public double getHolderWeight(){
    return holderWeight;
    }

    public double getBMI(){
        return (holderWeight * 703) / (holderHeight * holderHeight);
    }
}
