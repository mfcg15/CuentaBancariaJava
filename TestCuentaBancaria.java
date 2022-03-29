class TestCuentaBancaria 
{
    public static void main(String[] args) 
    {
        CuentaBancaria cuenta1 = new CuentaBancaria(100,200);
        CuentaBancaria cuenta2 = new CuentaBancaria(150,400);
     
        System.out.println("Numero de cuenta es :"+cuenta1.getNumeroCuenta());
        cuenta1.DepositarDinero("ahorro", 50.0);
        cuenta1.RetirarDinero("corriente", 70.0);
        cuenta1.MostrarCuenta();

        System.out.println("Numero de cuenta es :"+cuenta2.getNumeroCuenta());
        cuenta2.RetirarDinero("corriente", 20.0);
        cuenta2.DepositarDinero("ahorro", 30.0);
        cuenta2.MostrarCuenta();
    }

}
