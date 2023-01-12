public class Main {
    public static void main(String[] args) {
    }
    Drinks createObject (String className){
        createObject("Pepsi");
        switch (className){
            case "Fanta":
                Fanta fanta = new Fanta();
                return fanta;
            case "CocaCola":
                CocaCola cocaCola = new CocaCola();
                return cocaCola;
            case "Pepsi":
                Pepsi pepsi = new Pepsi();
                return pepsi;
            default:
                System.out.println("No Drink :)");

        }
        createObject("Pepsi").print();
        createObject("CocaCola").print();
        createObject("Fanta").print();
        return null;
    }
}