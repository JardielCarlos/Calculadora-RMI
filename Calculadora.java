import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

  Integer getSoma(Integer a, Integer b) throws RemoteException;
  Integer getSubtracao(Integer a, Integer b) throws RemoteException;
  Integer getMultiplicacao(Integer a, Integer b) throws RemoteException;
  Integer getDivisao(Integer a, Integer b) throws RemoteException;

}