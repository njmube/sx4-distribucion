package com.luxsoft.sx4.distribucion

import org.springframework.security.access.annotation.Secured

@Secured(['IS_AUTHENTICATED_REMEMBERED'])
class HomeController {

	@Secured(['permitAll'])
    def index() { }

    @Secured(["hasAnyRole('GERENTE')"])
    def administracion(){
    	
    }

    @Secured(['permitAll'])
    def pruebas(){
    	
    }

    // def cambiarPeriodo(Periodo command){
    //     def origin=request.getHeader('referer')
    //     session.periodo=command
    //     redirect(uri: request.getHeader('referer') )
        
    // }
}
