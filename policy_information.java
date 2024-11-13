import java.util.*; 
import java.io.*;

public class policy_information {
    public static void main(String[] args){
        try{
            File file = new File("PolicyInformation.txt");

            Scanner inputFile = new Scanner(file);

            int policyNum = 0, holderAge = 0;
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

                policy p = new policy(policyNum,providerName,holderFirstName,holderLastName,holderAge,holderSmokingStatus,holderHeight,holderWeight);

                policy.add(p);
            }
            inputFile.close();

            for(int i = 0; i < policy.size(); i++){
                System.out.println("Policy Number: " + policy.get(i).getPolicyNumber());
                System.out.println("Provider Name: " + policy.get(i).getProviderName());
                System.out.println("Policyholder First Name: " + policy.get(i).getHolderFirstName());
                System.out.println("Policyholder Last Name: " + policy.get(i).getHolderLastName());
                System.out.println("Policyholder's Age: " + policy.get(i).getHolderAge());
                System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.get(i).getHolderSmokingStatus());
                System.out.println("Policyholder' Height: : " + policy.get(i).getHolderHeight());
                System.out.println("Policyholder's Weight: " + policy.get(i).getHolderWeight());
                System.out.printf("Policyholder's BMI: %.2f\n\n", policy.get(i).getBMI());
            }
        }catch(IOException ex){
            System.out.println("Something went wrong reading the policy file: " + ex.getMessage());
        }
    }
}
