package CentricToAll10.OOPS.Inheritance.Multilevel;

public class Programminglanguages {
    //Attributes

    String language;

    int Foundedyear;

    //Note: Bydefault, Default constructor will be executed and shown as output

    /**
     * Programminglanguages()
     * {
     * System.out.println("Default constructor");
     * }
     **/

    Programminglanguages(String lang, int FOY) {
        this.language = lang;
        this.Foundedyear = FOY;
    }


    void printinfo() {
        System.out.println(language);
        System.out.println(Foundedyear);
        System.out.println(" Programming info : " + "Language-->" + this.language + " Founded in the year---> " + this.Foundedyear);
    }


}









