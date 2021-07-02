package MyFmaily;

public class CastingPractice {
    public static void main(String[] args) {
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        int i = 250;
        long iL = (long)i;
        short iS = (short)i;
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        int i$ = 100;
        float iF = (float)i$;
        System.out.println(iF + 5000.66);

        int i_ = 737;
        byte iB = (byte)i_;
        System.out.println(iB * 100);

        double d$ = 298.638;
        d$ = (d$/25);
        long d$L = (long)d$;
        System.out.println(d$L);
    }
}
