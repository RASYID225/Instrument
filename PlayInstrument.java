
// Buat Object Class dari Driver Class berikut 
public class PlayInstrument {
    public static void main(String[] args) {

        // membuat object
        // namaClass namaObject = new Constructor();
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType ("Guitar");
        a.setPrice (101.1);
        a.print();
        b.print();
        c.print();
        
    }
    
}
