package dareklimtofeet;


import mf.Meters_Feets;
import org.springframework.stereotype.Repository;

@Repository
public class MtoFDaoImpl implements MtFDao{

    @Override
    public void mCmToFeetInch(double meters, double centimeters) {

        Meters_Feets meters_feets = new Meters_Feets(meters, centimeters);

    }

}
