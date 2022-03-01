public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20; // количество бонусных миль
        return miles;
    }
}
