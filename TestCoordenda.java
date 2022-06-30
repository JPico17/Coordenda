public class TestCoordenda 
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada(0,0);
        c1.setX(2);
        c1.setY(10);
        System.out.println("Las Coordendas son : \n");
        System.out.println("X = " + c1.getX());
        System.out.println("Y = " + c1.getY());
        System.out.println(c1);

        Coordenada c2 = new Coordenada(1.3,5.3);
        System.out.println("Las Coordendas son : \n");
        System.out.println("X = " + c2.getX());
        System.out.println("Y = " + c2.getY());
        System.out.println(c2);

        Coordenada c3 = new Coordenada(c1);
        System.out.println("Las Coordendas son : \n");
        System.out.println(c3);

        Coordenada c4 = new Coordenada(c2);
        System.out.println("Las Coordendas son : \n");
        System.out.println(c4);

        if(c1.equals(c2)) 
        {
            System.out.println("Coordenada igual");
        }
        else
        {
            System.out.println("Coordenada diferente");
        }

        //System.out.println("Las distancia total entre la coordenada: " + c1 + " y la coordenda " + c2 + " es: ");
    }
}
