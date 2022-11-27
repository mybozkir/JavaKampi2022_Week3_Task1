public class CustomerManager {
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    private Customer _customer;
    private ICreditManager _creditManager;

    public void Save(){
        System.out.println("Müşteri kaydedildi : ");
    }

    public void Delete(){
        System.out.println("Müşteri silindi : ");
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
