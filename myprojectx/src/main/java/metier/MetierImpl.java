package metier;
import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements  IMetier{
    @Autowired
    IDAO dao;
    @Override
    public double calcul() {
        double data=dao.getData();
        return data*2021;
    }
    public void setDao(IDAO dao){
        this.dao=dao;
    }
}