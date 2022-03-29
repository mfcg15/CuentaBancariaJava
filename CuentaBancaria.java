class CuentaBancaria {

    private Double cuentaCorriente;
    private Double cuentaAhorro;
    private String numeroCuenta;

    private static int countCuentas = 0;
    private static double totalDinero = 0;

    public CuentaBancaria(double cuentaCorriente, double cuentaAhorro) 
    {
        this.cuentaAhorro = cuentaAhorro;
        this.cuentaCorriente = cuentaCorriente;
        this.numeroCuenta = numero();
        countCuentas++;
    }
    
    public static int cuentasCount() {
        return countCuentas;
    }

    public static Double TotalCuenta ()
    {   
        return totalDinero;
    }

    public Double getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(Double cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Double getCuentaAhorro() {
        return cuentaAhorro;
    }

    public void setCuentaAhorro(Double cuentaAhorro) {
        this.cuentaAhorro = cuentaAhorro;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void MostrarCuenta()
    {
        System.out.println("Su saldo actual en la cuenta corriente es de $"+cuentaCorriente);
        System.out.println("Su saldo actual en la cuenta ahorros es de $"+cuentaAhorro);
    }

    public void DepositarDinero(String tipoCuenta,Double cantidad)
    {
        if(tipoCuenta=="corriente")
        {
            cuentaCorriente = cuentaCorriente+cantidad;
        }
        else
        {
            cuentaAhorro = cuentaAhorro+cantidad;
        }

        totalDinero = cuentaCorriente+cuentaAhorro;
    }

    public void RetirarDinero(String tipoCuenta,Double cantidad)
    {
        if(tipoCuenta=="corriente")
        {
            double auxSaldo = cuentaCorriente- cantidad;

            if(auxSaldo>0)
            {
                cuentaCorriente = auxSaldo;
            }
            else
            {
                System.out.println("No tiene saldo sufiente para realizar esa operacion");
            }
        }
        else
        {
            double auxSaldo = cuentaAhorro- cantidad;

            if(auxSaldo>0)
            {
                cuentaAhorro = auxSaldo;
            }
            else
            {
                System.out.println("No tiene saldo sufiente para realizar esa operacion");
            }
        }
    }
    
    private String numero()
    {
        int numeroAletorio = 0;
        String numero = "";
        for(int i = 0; i < 10 ; i++)
        {
            numeroAletorio = (int) (Math.random()*10);
            numero += numeroAletorio+"";
        }
        return numero;
    }
}