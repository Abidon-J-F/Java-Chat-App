package R4.Utillity;

//static methods used to generate temporary passwords and 4 digit confirmation codes
public class CodeGenerator {

    //Method generates variable length random character codes with variables controlling the probability.
    public static String generateCharacterCode(int codeLength, double digitProbability){
        String code = "";
        double uppercase_probability = 0.5;
        int integerLimit = 10;
        int characterLimit = 26;

        for(int randomInt = 0; randomInt < codeLength; randomInt++){

            if(Math.random() <= digitProbability){
                code+= ((int) (Math.random() * integerLimit));
            }
            else{
                char randomLetter = (char)(((int)(Math.random() * characterLimit)) + 'a');
                if(Math.random() >= uppercase_probability){
                    randomLetter = Character.toUpperCase(randomLetter);
                }
                code+= randomLetter;
            }
        }
        return code;
    }
}
