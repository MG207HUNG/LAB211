public class Input {
    public int InputPositiveInteger(){
        String UserInput;
        int n;
        while(true){
            UserInput = scanner.nextLine();
            try{
                n = Integer.parseInt(UserInput) ;
                if(n<=0){
                    System.out.println("You must enter an positive integer number!!");
                }
                else{
                    return n;
                }
            }
            catch (NumberFormatException e){
                System.out.println("You must enter an positive integer number!!");
            }
        }
    }
}
