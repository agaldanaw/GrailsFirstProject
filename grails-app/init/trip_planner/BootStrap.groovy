package trip_planner

class BootStrap {

 String origen
    String destino
    Date fechaInicio
    int numeroPasajeros
    Date fechaFin
    def init = { servletContext ->

       def mydate = new Date()
        new Trip ( 'Cartagena','Bogota',mydate, mydate,2,'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fcdn-image.travelandleisure.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2F1600x1000%2Fpublic%2F1545256330%2Fgrand-canyon-TRIPSAVES1218.jpg%3Fitok%3DO6GK7NO_&q=85').save()
        new Trip ( 'Bogota','Cartagena',mydate, null,6,null).save()
        new Trip ( 'Mocoa','Bogota',mydate, null,8,null).save()
        new Trip ( 'Medellin','Bogota',mydate, mydate,1,'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fcdn-image.travelandleisure.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2F1600x1000%2Fpublic%2F1545256330%2Fgrand-canyon-TRIPSAVES1218.jpg%3Fitok%3DO6GK7NO_&q=85').save()
        new Trip ( 'Bogota','Medellin',mydate, null,5,null).save()
        new Trip ( 'Cartagena','Bogota',mydate, mydate,1,null).save()


    }
    def destroy = {
    }
}
