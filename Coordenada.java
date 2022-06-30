public class Coordenada 
{
    public static final String distanciaTotal = null;
    public static String calcularDistancia;
	private double x;
    private double y;

    public Coordenada()
    {

    }
    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c1)
    {
        x = c1.getX();
        y = c1.getY();
    }
    public double getX() 
    {
        return x;
    }
    public void setX(double x) 
    {
        this.x = x;
    }
    public double getY() 
    {
        return y;
    }
    public void setY(double y) 
    {
        this.y = y;
    }
    public String toString()
    {
        return "( " + x + "," + y + " )";
    }

    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (this.x == otra.x) && (this.y == otra.y);    
    }
    public double calcularDistancia()
    {
        double xr = x-x;
        double yr = y-y;
        int distanciaTotal;
        return distanciaTotal = (int) Math.sqrt(x*x + y*y);
    } 
    
}
