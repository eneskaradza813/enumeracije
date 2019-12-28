package vjzeba15;

public class Vjzeba15 {
    
    public enum DaysofWeek{
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        public int position;
        DaysofWeek(int i){
            this.position = i;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < DaysofWeek.values().length; i++) {
            System.out.println(DaysofWeek.values()[i]);
        }
        
    }

}
