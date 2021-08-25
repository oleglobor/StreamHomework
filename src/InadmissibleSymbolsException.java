public class InadmissibleSymbolsException extends Exception{
    public InadmissibleSymbolsException(){
        super("There are no title that contains such symbols: '#' '*' '$' '('");
    }
}
