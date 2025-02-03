public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("Arjun's Actions:");
        arjun.fight();
        arjun.obey();
        arjun.showKindness();
        
        System.out.println("\nBheem's Actions:");
        bheem.fight();
        bheem.obey();
        bheem.showKindness();

        System.out.println("\nDuryodhan's Actions:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.showKindness();
        
        System.out.println("\nVikarn's Actions:");
        vikarn.fight();
        vikarn.obey();
        vikarn.showKindness();
    }
}
