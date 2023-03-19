package dao;


public class DaoImpl implements IDAO{
    @Override
    public double getData() {
        System.out.println("From SQL DB");
        return(7);
    }
}
