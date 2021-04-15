import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showHolidays();
    }
        void showHolidays(){
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Exit"};

            ImageIcon holiday = new ImageIcon("holiday.jpg");
            String chooseMonth = (String) JOptionPane.showInputDialog(
                    null,
                    "Choose Month:",
                    "Holidays in Latvia in 2021!",
                    JOptionPane.INFORMATION_MESSAGE,
                    holiday,
                    months,
                    months[0]);

            if(chooseMonth == months[0]) {
                january();
                showHolidays();
            }else if (chooseMonth == months[1]) {
                february();
                showHolidays();
            }else if (chooseMonth == months[2]){
                march();
                showHolidays();
            }else if (chooseMonth == months[3]){
                april();
                showHolidays();
            }else if (chooseMonth == months[4]){
                may();
                showHolidays();
            }else if (chooseMonth == months[5]){
                june();
                showHolidays();
            }else if (chooseMonth == months[6]){
                july();
                showHolidays();
            }else if (chooseMonth == months[7]){
                august();
                showHolidays();
            }else if (chooseMonth == months[8]){
                september();
                showHolidays();
            }else if (chooseMonth == months[9]){
                october();
                showHolidays();
            }else if (chooseMonth == months[10]){
                november();
                showHolidays();
            }else if (chooseMonth == months[11]){
                december();
                showHolidays();
            }else if (chooseMonth == months[12]){
                System.exit(0);
            }

        }
        void january(){
            ImageIcon january = new ImageIcon("january.jpg");
            JOptionPane.showMessageDialog(
                    null,
                    "1st of January = New Year's Day!",
                    "Holidays in January!",
                    JOptionPane.INFORMATION_MESSAGE,
                    january
            );
        }
        void february(){
            ImageIcon february = new ImageIcon("february.jpg");
            JOptionPane.showMessageDialog(
                    null,
                    "14th of February = Valentine's Day!",
                    "Holidays in February!",
                    JOptionPane.INFORMATION_MESSAGE,
                    february
            );
        }
        void march(){
        ImageIcon march = new ImageIcon("march.jpg");
        JOptionPane.showMessageDialog(
                null,
                "8th of March = Woman's Day!",
                "Holidays in March!",
                JOptionPane.INFORMATION_MESSAGE,
                march
        );
    }
        void april(){
        ImageIcon april = new ImageIcon("april.jpg");
        JOptionPane.showMessageDialog(
                null,
                "2nd of April = Good Friday!\n" +
                        "4th of April = Easter Sunday!\n" +
                        "5th of April = Easter Monday!",
                "Holidays in April!",
                JOptionPane.INFORMATION_MESSAGE,
                april
        );
    }
        void may(){
        ImageIcon may = new ImageIcon("may.jpg");
        JOptionPane.showMessageDialog(
                null,
                "1st of May = Labour Day!\n" +
                        "4th of May = Restoration of Independence Day!\n" +
                        "9th of May = Mother's Day!\n" +
                        "23rd of May = Pentecost!",
                "Holidays in May!",
                JOptionPane.INFORMATION_MESSAGE,
                may
        );
    }
        void june(){
        ImageIcon june = new ImageIcon("june.jpg");
        JOptionPane.showMessageDialog(
                null,
                "23rd of June = Midsummer's Eve!\n" +
                        "24th of June = Midsummer's Day!",
                "Holidays in June!",
                JOptionPane.INFORMATION_MESSAGE,
                june
        );
    }
        void july(){
        ImageIcon july = new ImageIcon("july.jpg");
        JOptionPane.showMessageDialog(
                null,
                "No holidays celebrated in July!",
                "Holidays in July!",
                JOptionPane.INFORMATION_MESSAGE,
                july
        );
    }
        void august(){
        ImageIcon august = new ImageIcon("august.jpg");
        JOptionPane.showMessageDialog(
                null,
                "No holidays celebrated in August!",
                "Holidays in August!",
                JOptionPane.INFORMATION_MESSAGE,
                august
        );
    }
        void september(){
        ImageIcon september = new ImageIcon("september.jpg");
        JOptionPane.showMessageDialog(
                null,
                "No holidays celebrated in September!",
                "Holidays in September!",
                JOptionPane.INFORMATION_MESSAGE,
                september
        );
    }
        void october(){
        ImageIcon october = new ImageIcon("october.jpg");
        JOptionPane.showMessageDialog(
                null,
                "31th of October = Halloween!",
                "Holidays in October!",
                JOptionPane.INFORMATION_MESSAGE,
                october
        );
    }
        void november(){
        ImageIcon november = new ImageIcon("november.jpg");
        JOptionPane.showMessageDialog(
                null,
                "11th of November = Lāčplēsis Day (Latvian Freedom Fighters' Remembrance Day)!\n" +
                        "18th of November = Proclamation Day of the Republic of Latvia!",
                "Holidays in November!",
                JOptionPane.INFORMATION_MESSAGE,
                november
        );
    }
        void december(){
        ImageIcon december = new ImageIcon("december.jpg");
        JOptionPane.showMessageDialog(
                null,
                "24th of December = Christmas Eve!\n" +
                        "25th of December = Christmas Day!\n" +
                        "26th of December = Second Day of Christmas!\n" +
                        "31st of December = New Year's Eve!",
                "Holidays in December!",
                JOptionPane.INFORMATION_MESSAGE,
                december
        );
    }

}