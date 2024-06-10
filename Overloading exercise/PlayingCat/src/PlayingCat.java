public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {

        return ( summer && ( temperature >= 25 && temperature <= 45 ) )
                || ( !summer && ( temperature >= 25 && temperature <= 35 ) );
    }

    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(true,29));
    }
}