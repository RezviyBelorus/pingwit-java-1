package pingwit.lec_16.classwork.point_3;

public class StringChanger {
    private StringBuilder stringBuilder = new StringBuilder();

    private StringBuffer stringBuffer = new StringBuffer();

    private String string = "";

    public void addStringSpace() {
        string = string + " ";
    }

    public void addBuilderSpace() {
        stringBuilder.append(" ");
    }

    public void addBufferSpace() {
        stringBuffer.append(" ");
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public String getString() {
        return string;
    }
}
