package com.luxsoft.sx4.distribucion

//import org.springframework.security.access.annotation.Secured
import grails.plugin.springsecurity.annotation.Secured

@Secured(["hasAnyRole('ADMIN')"])
class ImportadorController {

    def index() { }

    def importarSurtido(){
    	
    }


    def importPedidoSql="""
    	select 
		s.nombre as sucursal,p.folio as pedido	,v.nombre as cliente,date(p.fecha) as fecha
		,p.MODIFICADO_USR as vendedor,v.modificado as facturado,p.creado as pedidoCreado,p.PEDIDO_ID as origen
		from sx_ventas v
		join sx_pedidos p on v.pedido_id=p.pedido_id
		join sw_sucursales s on v.SUCURSAL_ID=s.SUCURSAL_ID
    """
}
