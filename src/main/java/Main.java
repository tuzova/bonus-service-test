public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    //объявим тип и наименование итоговой переменной
    long bonus = service.calculate(amount, registered);

    //объявим функцию вывода итоговой переменной
    System.out.println(bonus);

  }
}

