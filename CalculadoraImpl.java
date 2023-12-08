import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
  protected CalculadoraImpl() throws RemoteException {
    super();
  }

  @Override
  public Integer getSoma(Integer a, Integer b) {
    return a + b;
  }

  @Override
  public Integer getSubtracao(Integer a, Integer b) {
    return a - b;
  }

  @Override
  public Integer getMultiplicacao(Integer a, Integer b) {
    return a * b;
  }

  @Override
  public Integer getDivisao(Integer a, Integer b) {
    return a / b;
  }

}
