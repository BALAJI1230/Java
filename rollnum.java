import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class S{
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter rollno");
        String n=br.readLine();
        String name=n.trim();
        String s=name.substring(0,2);
        char a=name.charAt(2);
        String b=name.substring(3,6);
        int j=Integer.valueOf(b);
        int k=Integer.valueOf(s);
        String x="20";
        String l=x.concat(s);
        int year=Integer.valueOf(l);
        if((name.length()==6) && (a >='A') && (a <='Z') && (j>100) ){
            System.out.println("VALIDATION:     valid Rollnumber");
            switch(a){
                case 'L':
                   System.out.println("YOUR DEPT IS:   ECE");
                   break;
                case 'T':
                   System.out.println("YOUR DEPT IS:   ETE");
                   break;
                case 'A':
                   System.out.println("YOUR DEPT IS:   AUTO");
                   break;
                case 'M':
                   System.out.println("YOUR DEPT IS:   MECH");
                   break;
                case 'F':
                   System.out.println("YOUR DEPT IS:   IT");
                   break;
                case 'E':
                   System.out.println("YOUR DEPT IS:  EEE");
                   break;
                case 'N':
                   System.out.println("YOUR DEPT IS:  EIE");
                   break;
                case 'C':
                   System.out.println("YOUR DEPT IS:  CIVIL");
                   break;
                }
                if((j>100) && (j<=199)){
                    System.out.println("SECTION:       A");
                }
                else if((j>200) && (j<=299)){
                    System.out.println("SECTION:       B");
                }
                else if((j>300) && (j<=399)){ 
                    System.out.println("SECTION:       C");
                }
                else if((j>500) && (j<=599)){ 
                    System.out.println("SECTION:       A-LATERAL ENTRY");
                }
                else if((j>600) && (j<=699)){
                    System.out.println("SECTION:       B-LATERAL ENTRY");
                }
                else if((j>700) && (j<=799)){
                    System.out.println("SECTION:       C-LATERAL ENTRY");
                }
                switch(k){
                    case 1:
                       break;
                    default:
                      if((j>100) && (j<399)){
                         System.out.println("YOUR ENTRYING YEAR IS: "+l);
                         System.out.println("YOUR PASSING YEAR IS "+ (year+4));
                      }
                      else if(j>400){
                          System.out.println("YOUR ENTRYING YEAR IS: "+l);
                          System.out.println("YOUR PASSING YEAR IS "+ (year+3));
                      }
                }

        }
        else if((a>='a')  && (a<'z')){
            String h=name.toUpperCase();
            System.out.println("enter the rollnumber as"+h);

       }

        else{
            System.out.println("INvalid Rollnumber");
        }


    }
}


