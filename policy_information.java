import java.util.*; 
import java.io.*;

public class policy_information {
    public static void main(String[] args){
        try{
            File file = new File("PolicyInformation.txt");

            Scanner inputFile = new Scanner(file);

            int policyNum = 0, holderAge = 0, smoker = 0, nonSmoker = 0;
            double holderHeight = 0, holderWeight = 0;
            String providerName = "", holderFirstName = "", holderLastName = "", holderSmokingStatus = "";
            
            ArrayList<policy> policy = new ArrayList<policy>();

            while(inputFile.hasNext()){
                policyNum = inputFile.nextInt();
                inputFile.nextLine();
                providerName = inputFile.nextLine();
                holderFirstName = inputFile.nextLine();
                holderLastName = inputFile.nextLine();
                holderAge = inputFile.nextInt();
                inputFile.nextLine();
                holderSmokingStatus = inputFile.nextLine();
                holderHeight = inputFile.nextDouble();
                holderWeight = inputFile.nextDouble();


                if(inputFile.hasNext()){
                    inputFile.nextLine();
                    inputFile.nextLine();
                }
                PolicyHolder h = new PolicyHolder(policyNum,providerName,holderFirstName,holderLastName,holderAge,holderSmokingStatus,holderHeight,holderWeight);
                policy p = new policy(h);
                if(h.getHolderSmokingStatus().equalsIgnoreCase("smoker")){
                    smoker += 1;
                }else{
                    nonSmoker += 1;
                }
                policy.add(p);
            }
            inputFile.close();

            for(int i = 0; i < policy.size(); i++){
                System.out.println(policy.get(i).toString());

                if (i == policy.size() - 1){
                    System.out.println("There were " + policy.get(i).getPolicyHolder().policyCount +  " Policy Objects created.\n");
                }   
            }
            System.out.println("The number of policies with a smoker is: " + smoker);
            System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
        }catch(IOException ex){
            System.out.println("Something went wrong reading the policy file: " + ex.getMessage());
        }
    }
}
