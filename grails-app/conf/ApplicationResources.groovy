modules = {
    
    common {
    	resource url:'js/chico.js'	
    }

    init {
    	dependsOn 'common'
    	resource url:'js/init.js'
    }
}