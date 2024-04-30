package Publicacion;

public class Tesis extends Publicacion{
    private String areaDeInvestigacion;
    public Tesis(String titulo,String fecha,String areaDeInvestigacion){
        //llamo al constructor de publlicacion
        //valores concretos
        super(titulo,"Pepe",fecha);
        this.areaDeInvestigacion=areaDeInvestigacion;

    }
    public String resumen(){
        return "titulo "+titulo;
    }
}
