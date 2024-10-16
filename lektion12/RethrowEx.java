public class RethrowEx {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        try {
            d();
        }
        catch (UnsupportedOperationException ex) {
            throw new RuntimeException("oops", ex);
        }
    }

    private static void d() {
        e();
    }

    private static void e() {
        throw new UnsupportedOperationException("Unimplemented method 'e'");
    }
}
