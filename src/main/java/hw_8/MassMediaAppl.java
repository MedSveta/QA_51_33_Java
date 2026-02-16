package hw_8;

import java.util.Arrays;

public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] mass = {
                new Newspaper("Morning Post", 23, 12),
                new Newspaper("Global Times", 25, 16),
                new Newspaper("Daily News", 41, 8),
                new Journal("Glamour", 3, 48, true),
                new Journal("Mursilka", 11, 24, false),
                new Journal("Yuniy Naturalist", 9, 36, true),
                new NewsPortal("CNN", "url1"),
                new NewsPortal("BBC", "url2"),
                new WebSite("Wiki", "url3", "author1"),
                new WebSite("Google", "url4", "google1"),
        };

        displayPrintable(mass);
        System.out.println("============");
        MassMedia[] res = getNoPrintable(mass);
        System.out.println(Arrays.toString(res));
    }

    private static void displayPrintable(MassMedia[] mass) {
        for (MassMedia m : mass) {
            if (m instanceof IPrintable) {
                ((IPrintable) m).print();
            }
        }
    }

    private static MassMedia[] getNoPrintable(MassMedia[] mass) {
        int count = 0;
        for (MassMedia m : mass) {
            if (!(m instanceof IPrintable)){
                count++;
            }
        }
        MassMedia[] res = new MassMedia[count];
        int i = 0;
        for (MassMedia m: mass){
            if(!(m instanceof IPrintable))
                res[i++] = m;
        }
        return res;
    }
}
