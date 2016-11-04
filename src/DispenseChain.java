/**
 * Created by Varun on 11/4/2016.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
