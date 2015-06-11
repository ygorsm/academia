
package Model;


public class Tipo {
  int idtipo;
  String musculação,zumba,bike_indoor;

    public Tipo(int idtipo, String musculação, String zumba, String bike_indoor) {
        this.idtipo = idtipo;
        this.musculação = musculação;
        this.zumba = zumba;
        this.bike_indoor = bike_indoor;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getMusculação() {
        return musculação;
    }

    public void setMusculação(String musculação) {
        this.musculação = musculação;
    }

    public String getZumba() {
        return zumba;
    }

    public void setZumba(String zumba) {
        this.zumba = zumba;
    }

    public String getBike_indoor() {
        return bike_indoor;
    }

    public void setBike_indoor(String bike_indoor) {
        this.bike_indoor = bike_indoor;
    }

   
  
}
