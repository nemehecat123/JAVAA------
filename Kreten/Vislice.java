public class Vislice extends IgraZaDva implements IIgra{
    private String SkritaBeseda;
    private StringBuffer TrenutnaBeseda=new StringBuffer();
    public Vislice() {
        
        
    }
    public String getSkritaBeseda() {
        int x  =(int)(Math.random()*10+1);
        switch (x) {
            case 1:
            return "PRIPEKA";
            case 2:
            return "ZVEZEK";
            case 3:
            return "DEZINFEKTOR";
            case 4:
            return "DALJINEC";
            case 5:
            return "FLOMASTER";
            case 6:
            return "POSODA";
            case 7:
            return "NAVODILA";
            case 8:
            return "KEMIK";
            case 9:
            return "OBESEK";
            case 10:
            return "TORBICA";
                
            default:
                break;
        }
        return "";
    }
    @Override
    public String getPromptIgre() {
        return "\n izberi si eno črko";
    }
    @Override
    public String reportIgra() {
        return "";
    }
    @Override
    public void Igraj(Ivmesnik ui) {
        SkritaBeseda= getSkritaBeseda();
        
       while(!konecIgre()){
        IPlayer rač =null;
        ui.report(reportIgra());
        switch (getIgralec()) {
            case 1:
                rač =rač1;
                break;
        
            case 2:
                rač =rač1;
                break;

             default:
                break;
        }
        

    }
        

    }
    @Override
    public boolean konecIgre() {
        return SkritaBeseda.length()==TrenutnaBeseda.length();
    }
    @Override
    public String dobiZmagovalca() {
       
        return "igralec "+getIgralec();
    }
    public String UgibajČrko(String s,Ivmesnik ui){
        ui.report("Ugibaj črko "+ui.getUserInput());
        return s;
    }

    public String preglejBesedo(Ivmesnik ui, String s){
        

        return " ";
    }
    public String VzeteČrke(){
        return "";
    }
    
 }
    

