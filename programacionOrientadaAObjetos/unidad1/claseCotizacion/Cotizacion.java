package claseCotizacion;

public class Cotizacion {
    private int folio;
    private String descripcion;
    private int porPagoInicial;
    private int plazos;
    private float precio;

    public Cotizacion(){
        //constructor por omision
        this.folio = 0;
        this.descripcion = "";
        this.porPagoInicial = 0;
        this.plazos = 0;
        this.precio = 0.0f;
    }

    public Cotizacion(int folio, String descripcion, int porPagoInicial, int plazos, float precio) {
        //constructor por argumentos
        this.folio = folio;
        this.descripcion = descripcion;
        this.porPagoInicial = porPagoInicial;
        this.plazos = plazos;
        this.precio = precio;
    }

    public Cotizacion(Cotizacion otra){
        //constructor copia
        this.folio = otra.folio;
        this.descripcion = otra.descripcion;
        this.porPagoInicial = otra.porPagoInicial;
        this.plazos = otra.plazos;
        this.precio = otra.precio;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorPagoInicial() {
        return porPagoInicial;
    }

    public void setPorPagoInicial(int porPagoInicial) {
        this.porPagoInicial = porPagoInicial;
    }

    public int getPlazos() {
        return plazos;
    }

    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float calcularPagoInicial(){
        float pagoInicial = 0.0f;
        pagoInicial = this.precio * this.porPagoInicial / 100;
        return pagoInicial;
    }

    public float calcularTotalAFin(){
        float totalAFin;
        totalAFin = this.precio - this.calcularPagoInicial();
        return totalAFin;
    }

    public float calcularPagoMes(){
        float pagoMes = 0.0f;
        pagoMes = this.calcularTotalAFin() / this.plazos;
        return pagoMes;
    }
}
