package TypeOfVariable;

public class NonStaticGlobalVariable {
	
	int Age1 = 50; // Non static global variable
    String name = "Ketan";

    public static void main(String[] args) {
    	NonStaticGlobalVariable NSG = new NonStaticGlobalVariable();
    	
    	//syntax--> System.out.println(referenceVariableName.VariableName);
        System.out.println(NSG.Age1);
        System.out.println(NSG.name);
        
       NSG.Test();
        
        
    }

    public void Test() {
         int Demo = 40;
       name = "RRR";

        System.out.println(Demo);
        System.out.println(name);
    }
    

}
