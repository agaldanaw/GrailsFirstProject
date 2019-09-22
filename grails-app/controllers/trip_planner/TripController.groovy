package trip_planner

class TripController {

    static allowedMethods = [save: 'POST', update: 'PUT', delete: 'DELETE']
    

    def index() { 
        def taskList = Trip.createCriteria().list (params) {
            if ( params.query ) {
                ilike("destino", "%${params.query}%")
            }
        }
        respond taskList
    }

    def create()
    {
        respond new Trip() 
    }

    def show()
    {
        def t = Trip.get(params.id)
        respond  t
    }

    def edit()
    {
        respond Trip.get(params.id) 
    }


    def save(Trip trip) {
        if (trip == null) {
            return
        }

        if (trip.hasErrors()) {
            respond trip.errors, view:'create'  
            return
        }

        trip.save()
        
        redirect action: 'index', controller: 'Trip', namespace: null
    }

    def delete()
    {
        def a = Trip.findById(params.id)
        a.delete()
        redirect action: 'index', controller: 'Trip', namespace: null
    }

    def update(Trip trip)
    {
        trip.save()
        redirect action: 'index', controller: 'Trip', namespace: null
    }
}
