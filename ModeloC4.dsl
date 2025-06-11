workspace "Pago impuestos 103 y 104" {
    description "Sistema de cuadre y conciliación para el pago de impuestos"
    
    model {
        pUsuario = person "Especialista"
        pAdministrador = person "Supervisor"
        pAuditor = person "Auditor"
        
        sDocElectronicos = softwareSystem "Información de comprobantes autorizados" {
            
        }
        sCuadre = softwareSystem "Cuadre y conciliación pago Impuestos" {
            tags "SistemaCuadre"
            
            portalUsuario = container "pagina de revisión y ajuste de cuadre de pago impuestos" {
                tags "AppWeb"
                pUsuario -> this "Validación cuadre automático"
            }
        
            portalSupervisor = container "pagina de revisión de cuadre final de pago impuestos" {
                tags "AppWeb"
                pAdministrador -> this "Revisar cuadre final"
                pAuditor -> this "Audita el pago de impuestos"
            }
            
            sATS = container "toma los Anexos Transaccionales de todos los legados"{
                tags "almacen"
            }
            
            sConta = container "toma la contabilidad de las cuentas de impuestos"
            
            bdATS = container "Almacena los ATS depurados y cuadrados que se presentaron al SRI"
            
            api = container "API" {
                tags "Api"
                sATS -> this "Toma la información ATS"
                sConta -> this "Toma la información Contabilidad"
                sDocElectronicos -> this "Toma información de los comprobantes electrónicos"
                bdATS -> this "Almacena los ATS reportados al SRI por 7 años"
                
                ATSComponente = component "ATS Componentes" "Toma el ATS en XML y serapa en Compras, Ventas, Rendimientos y Anulados, y envía a guardar a Base de datos"
                InsumosComponente = component "Controlador de Insumos" "Permite tomar los insumos cuadrar y cruzar la inforación"
                LLenadoComponente = component "Llenado de Insumos" "Tomar los Comprobantes electrónicos y la información faltante en el ATS"
                
            }
            BaseDatosATS = container "Base Datos ATS" {
                tags "Database"
                api -> this "Almacena en tabla de Compras, Ventas, Rendimientos y Anulados"
            }
            
            baseDatos = container "Base Datos" {
                tags "Database"
                api -> this "CrearCruces, eleminar, editar, Actualizar"
            }
        }
        
        
       
        
        
        sCuadre -> sDocElectronicos "Toma los secuenciales y autorizaciones de comprobantes"
    }
    
    views {
        systemContext sCuadre {
            include *
            autolayout lr
        }
        container sCuadre {
            include *
            autolayout 
        }
        component api "Componentes" {
            include *
            autolayout
        }
        
        styles {
            element "SistemaCuadre" {
                shape Hexagon
                background #f26522
                color #ffffff
            }
            element "almacen" {
                shape circle
                background #3393ff
                color #ffffff
            }
            element "Database" {
                shape cylinder
                background #85d1e4
                color #080808
            }
        }
        
        theme "https://srv-si-001.utpl.edu.ec/REST_PRO_ERP/Recursos/Imagenes/themeAZ_2023.json"
    }
   
}
