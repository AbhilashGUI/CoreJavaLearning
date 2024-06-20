package CentricToAll4;

public class Lab054
{
    public static void main(String[] args)
    {
    char code = 'D';
    int val = switch (code) {
        case 'A' :
            yield 65; //Return type
        case 'B' :
            yield 66;
        case 'C' :
            yield 67;

        default:
            throw new IllegalStateException("Unexpected value: " + code);
            //Throw keyword is used to throw an exception explicitly
    };

        System.out.println(val);   //Value get printed


}
}