package Maps;

public class Runner {
    public static void main(String[] args) {

        MorseTranslator translator = new MorseTranslator();

        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        // split it on the / and then on spaces


    }
}
