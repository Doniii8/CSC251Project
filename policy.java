public class policy {
    
   PolicyHolder holder;

   public policy(PolicyHolder h) {
      setPolicyHolder(h);
   }

   //setters
   public void setPolicyHolder(PolicyHolder h) {
      holder = h;
   }

   //getters
   public PolicyHolder getPolicyHolder() {
      return holder;
   }
    /**
       returns the holder's BMI based on the holder's weight and holder's height
       @return policyNum
     */
    public double getBMI(){
      final double CONVFACTOR = 703;
        return (holder.getHolderWeight() * CONVFACTOR) / (holder.getHolderHeight() * holder.getHolderHeight());
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
      
      if(holder.getHolderAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(holder.getHolderSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
   public String toString(){
      return String.format(holder.toString() + "Policyholder's BMI: " + Math.round(getBMI() * 100.0)/100.0
      + "\nPolicy Price: $" + getPrice() + "\n");
   }
}
