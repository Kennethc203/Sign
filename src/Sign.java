public class Sign {
    private int width;
    private String text;

    public Sign(String text, int width){
        this.text = text;
        this.width = width;
    }

    public int numberOfLines(){
        if (text.isEmpty())
            return 0;
        else if (text.length() % width == 0)
            return text.length() / width;
        else
            return text.length() / width + 1;
    }

    public String getLines(){
        if (text.isEmpty()) return "null";
        String gottenLines = "";
        int chars = 0;
        for (int i = 0; i < text.length(); i++){
            gottenLines += text.substring(i, i + 1);
            chars++;
            if (chars >= width){
                gottenLines += ";";
                chars = 0;
            }
        }
        if (gottenLines.endsWith(";")) gottenLines = gottenLines.substring(0, gottenLines.length() - 1);
        return gottenLines;

    }
}
