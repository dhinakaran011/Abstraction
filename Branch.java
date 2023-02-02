class Branch extends Branch_Plan{
public void receive_Customers(){
 System.out.println("Received Customers");
 }
public static void main(String args[]){

Branch branch = new Branch();
branch.check_accounts(1000);
int a = branch.pay_tax(2000);
System.out.println(a);
branch.do_interview();
}
}
