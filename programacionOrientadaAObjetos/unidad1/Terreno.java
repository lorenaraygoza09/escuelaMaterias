//Unidad 1
public class Terreno {
    private int numLote;
    private float anchoN;
    private float largoY;

    public Terreno() {
        //constructor por omision, inicializar valores en 0
        this.numLote = 0;
        this.largoY = 0.0f;
        this.anchoN = 0.0f;
    }

    public Terreno(int numLote, float largoY, float anchoN) {
        //constructor por argumentos
        this.numLote = numLote;
        this.largoY = largoY;
        this.anchoN = anchoN;
    }

    public Terreno(Terreno otro){
        //constructor copia
        this.numLote = otro.numLote;
        this.anchoN = otro.anchoN;
        this.largoY = otro.largoY;
    }
    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public float getAnchoN() {
        return anchoN;
    }

    public void setAnchoN(float anchoN) {
        this.anchoN = anchoN;
    }

    public float getLargoY() {
        return largoY;
    }

    public void setLargoY(float largoY) {
        this.largoY = largoY;
    }

    //METODOS DE COMPORTAMIENTO
    public float calcularPerimetro(){
        float perimetro = 0.0f;
        perimetro = this.largoY * 2 + this.anchoN * 2;
        return perimetro;
    }

    public float calcularArea(){
        float area = 0.0f;
        area = this.anchoN * this.largoY ;
        return area ;
    }
}
