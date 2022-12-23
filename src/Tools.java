
public final class Tools {
    public static String splitWord(String word) {
        String result = "";

        try {
            int karakterAdedi = word.length();
            int orta=karakterAdedi/2;
            orta=karakterAdedi%2==0?orta:orta+1;
            result=word.substring(0,orta)+"-"+word.substring(orta);

        } catch (NullPointerException ex) {
            System.err.println("Hata : " + ex.getMessage());
        }catch (StringIndexOutOfBoundsException ex){
            System.err.println("Hata: "+ex.getMessage());
        }

        return result;
    }
}

