Feature: OrangeHRM Demo

    Scenario Outline: Login en OrangeHRMDemo
        Given acceso a la pagina de orangeHRMDemo
        When ingreso nombre de usuario "<usuario>", contrasena "<contrasena>" y doy click en ingresar
        Then valido que haya ingresado
        Examples:
            | usuario | contrasena |
            | Admin   | admin123   |