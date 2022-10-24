/*
* File: App.java
* Author: Zentai Pál
* Group: Szoft-II-N
* Date: 2022-10-24
* Github: https://github.com/Pali002/
*/

public class App {
    public static void main(String[] args) throws Exception {
        Bela bela = new Bela();
        Geza geza = new Geza();
        kiirat(bela);
        kiirat(geza);
    }
    public static void kiirat(Tanulok tanulo) {
        tanulo.getNames();
    }
}
