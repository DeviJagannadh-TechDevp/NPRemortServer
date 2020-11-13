import java.rmi.*;
import java.rmi.server.*;
public class AddRemImpl extends UnicastRemoteObject implements AddRem
{

public AddRemImpl() throws RemoteException{}
public int addNumu(int a , int b){
return(a+b);
}

}
