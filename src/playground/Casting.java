package playground;

public class Casting {
        public static void casting(){
            byte meuByte = 1;
            short meuShort = meuByte;
            System.out.println("Fazendo meu casting implicito " + meuShort);

            double meuDouble = 10.12334;
            int meuInt = (int) meuDouble;
            System.out.println("Fazendo meu casting explicito " + meuInt);
    }
}
