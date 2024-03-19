package ejemploEnum;

public class NewMain {

    public static void main(String[] args) {
        Transporte tran = Transporte.AUTO;

        System.out.println("Valor: " + tran);

        Transporte tran2 = Transporte.CAMION;

        if (tran == Transporte.AUTO) {
            System.out.println("El valor del transporte es un Auto!");
        }
        
        switch(tran){
            case AUTO:
                System.out.println("El auto lleva personas");
                break;
            case COLECTIVO:
                System.out.println("El bondi lo maneja le chofer");
                break;
                
        }
        
    }

}
