public class policy {
    private int policyNum = 0, holderAge = 0;
    private double holderHeight = 0, holderWeight = 0;
    private String providerName = "", holderFirstName = "", holderLastName = "", holderSmokingStatus = ""; 

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

    /**
       returns the holder's BMI based on the holder's weight and holder's height
       @return policyNum
     */
    public double getBMI(){
      final double CONVFACTOR = 703;
        return (holderWeight * CONVFACTOR) / (holderHeight * holderHeight);
    }

    /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(holderAge > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(holderSmokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }

}
