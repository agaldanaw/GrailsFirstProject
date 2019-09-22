package trip_planner

class BootStrap {

 String origen
    String destino
    Date fechaInicio
    int numeroPasajeros
    Date fechaFin
    def init = { servletContext ->

       def mydate = new Date()
        new Trip ( 'Cartagena','Bogota',mydate, mydate,2).save()
        new Trip ( 'Bogota','Cartagena',mydate, null,6).save()
        new Trip ( 'Mocoa','Bogota',mydate, null,8).save()
        new Trip ( 'Medellin','Bogota',mydate, mydate,1).save()
        new Trip ( 'Bogota','Medellin',mydate, null,5).save()
        new Trip ( 'Cartagena','Bogota',mydate, mydate,1).save()


    }
    def destroy = {
    }
}
