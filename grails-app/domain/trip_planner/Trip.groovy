package trip_planner

class Trip {

    String origen
    String destino
    Date fechaInicio
    int numeroPasajeros
    Date fechaFin

    static constraints = {
        origen maxSize: 255, nullable:false
        destino maxSize: 255, nullable: false
        numeroPasajeros nullable: false
        fechaInicio nullable : false
        fechaFin nullable : true
    }

    def Trip(String origen, String destino, Date fechaInicio, Date fechaFin, int numeroPasajeros)
    {
        this.origen = origen
        this.destino = destino
        this.fechaInicio = fechaInicio
        this.fechaFin = fechaFin
        this.numeroPasajeros = numeroPasajeros
    }

     
}
