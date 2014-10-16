
import java.rmi.*;
import java.rmi.activation.*;

public class ICompteActivatableImpl extends Activatable implements ICompteFonctions {

    public ICompteActivatableImpl(ActivationID id, MarshalledObject mo)
            throws java.rmi.RemoteException {
        super(id, 0);
        double solde;
        System.out.println("ICompteActivatableImpl est activé comme ayant l'id = " + id);
    
}