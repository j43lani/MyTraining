package amazon.coding.samples;

public class SIP {
    public static void main(String[] args) {
        String charInput = "aabccdgg";
        SIP sip = new SIP();
        System.out.println(sip.encode(charInput));

    }

    public String encode(String input){
        if(input=="" || input.length()<1)
            return "";
        StringBuilder sb = new StringBuilder();
        char[] inputChar = input.toCharArray();
        char prevChar = 0;
        int counter = 0;
        for(char c:inputChar){
            if(c==prevChar){
                counter++;
            }else{

                if(prevChar != 0)
                    sb.append(counter).append(prevChar);
                prevChar=c;
                counter = 1;
            }
        }
        sb.append(counter).append(prevChar);
        return sb.toString();
    }
}