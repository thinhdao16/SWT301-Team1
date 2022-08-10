
package lab4swt;


public class Lab4SWT {

    public Boolean checkDate(String x, String y, String z) {
        try {
            int day = Integer.parseInt(x);
            int month = Integer.parseInt(y);
            int year = Integer.parseInt(z);
            //sua src code
            if (year < 1900) {
                 return false;
            }
            //
            if ((day <= 0) || (day >= 32) && (month <= 0) || (month >= 13)) {
                return true;
            } 
            if ((month == 1) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            //sua src code
            if ((month == 2) && (day >= 1) && (day <= 29)) {
                return true;
            }
            //sua src code
            if ((month == 2) && (day >= 1) && (day <= 30) && (year % 4 == 0)) {
                return true;
            }
            //sua src code
            if ((month == 3) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            //sua src code
            if ((month == 4) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            if ((month == 5) && (day >= 1) && (day <= 31)) {
                return true;
            }
            if ((month == 6) && (day >= 1) && (day <= 30)) {
                return true;
            }
            if ((month == 7) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            if ((month == 8) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            if ((month == 9) && (day >= 1) && (day <= 30)) {
                return true;
            } 
            if ((month == 10) && (day >= 1) && (day <= 31)) {
                return true;
            } 
            if ((month == 11) && (day >= 1) && (day <= 30)) {
                return true;
            }
            if ((month >= 12) && (day >= 1) && (day <= 31)) {
                return true;
            }
        } catch (Exception e) {
            return true;
        }
        return true;
    }
    public int checkMonth(String y, String z) {
        try {

            int month = Integer.parseInt(y);
            int year = Integer.parseInt(z);

            if (year != 1) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    return 30;
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 31;
                }
                if (month == 2 && year % 4 == 0) {
                    return 28;
                }
                if (month == 2 && year % 4 != 0) {
                    return 29;
                } else {
                    return 0;
                }
            }
        } catch (Exception e) {
            return 29;
        }
        return 29;
    }
}
