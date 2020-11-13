import java.rmi.*;
import java.rmi.net.*;
public class AddServer{
public static void main(String args[]){

try{
AddRemInpl locobj=new AddRemImpl();
Naming.rebind("emi://AddRem",locobj);
}

catch(RemoteException re){
re.printStackTrace();
}
catch(MalformedURLException mfw){
mfe.printStackTrace();
}

}}
