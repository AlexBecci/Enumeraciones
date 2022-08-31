package enumeracion;

public enum Contintentes {
    //ENUMERACIONES CON ATRIBUTOS
    AFRICA(53),//Puede tener mas valores como los habitantes de el continente de tipo String: 1.2 billones de habitantes
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    //DEFINIDOS UN ATRIBUTO PRIVADO FINAL DE TIPO ENTERO 
    private final int paises;

    //DEFINIMOS UN CONSTRUCTOR
    //ESTO SE ASOCIA CON LOS ELEMENTOS DE LA ENUMERACION
    Contintentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
