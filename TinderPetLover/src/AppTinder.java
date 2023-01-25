import DataAccess.DataAccesComponent;

public class AppTinder {
    public static void main(String[] args) {
        DataAccesComponent dac = new DataAccesComponent();

        //dac.getPersonaID(1);
        //dac.getPersonaID(3);

        dac.findPersonaNombre("Juan");
    }
}
