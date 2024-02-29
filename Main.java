
public class Main {
    public static void main(String[] args) {
        genArraylist <atk> atklist = new genArraylist<>(5);
        genArraylist <Bag> Baglist = new genArraylist<>(5);

        atklist.addData(new atk("A002", "Pulpen","Pulpen Kenko", 23));
        atklist.addData(new atk("A003", "Pensil","Faber castel",230));
        atklist.addData(new atk("A004", "Spidol","Snowboard", 21));
        atklist.addData(new atk("B007", "Buku Tulis","Sinar Dunia", 56));
        atklist.addData(new atk("B008", "Kertas","Kervas", 43));
        Baglist.addData(new Bag("C004", "Tempat Tulis","DapGud", 437));
        Baglist.addData(new Bag("C005", "Tas","Baggud", 453));

        atklist.display();
        Baglist.display();
    }
}
