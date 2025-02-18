import java.util.*;
import java.util.Scanner;

class Railway {
    String name;
    String src;
    String dest;
    int tno;
    int dob;
    int doj;

    Railway(String name, String src, String dest, int tno, int dob, int doj) {
        this.name = name;
        this.src = src;
        this.dest = dest;
        this.tno = tno;
        this.dob = dob;
        this.doj = doj;
    }

    public String toString() {
        return name + "|" + src + "|" + dest + "|" + tno + "|" + dob + "|" + doj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO WESTERN RAILWAY");
        System.out.println(" TO BOOK YOUR TICKET ");

        System.out.println("ENTER NO OF PASSENGER");
        int n = Integer.parseInt(sc.nextLine());
        Map<Integer, Railway> m = new HashMap();
        int pnr = 45521;
        for (int i = 0; i < n; i++) {
            System.out.println(" ENTER YOUR NAME");
            String name = sc.nextLine();
            System.out.println(" ENTER YOUR source");
            String src = sc.nextLine();

            System.out.println(" ENTER YOUR destination");
            String dest = sc.nextLine();
            System.out.println(" ENTER TRAIN NUMBER");
            int tno = Integer.parseInt(sc.nextLine());

            System.out.println(" ENTER YOUR DOB");
            int dob = Integer.parseInt(sc.nextLine());
            System.out.println(" ENTER YOUR DOJ");
            int doj = Integer.parseInt(sc.nextLine());
            m.put(pnr, new Railway(name, src, dest, tno, dob, doj));
            pnr++;
        }
        System.out.println(m);
    }
}