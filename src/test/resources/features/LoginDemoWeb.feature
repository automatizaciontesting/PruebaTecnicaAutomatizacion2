# encoding: iso-8859-1
Feature: Realizar login aplicacion Acme demo
  Como usuario quiero loguearme en la aplicacion y realizar validaciones

  @AcmeDemoSesion
  Scenario: Validar inicio de sesion Acme demo
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido inicio de sesion

  @ValidarNumeroTransacciones
  Scenario: Validar numero de transacciones en el home
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido numero transaccion 6 en el home

  @ValidarTotalBalance
  Scenario: Validar el total balance en el home
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido el total balance de 350

  @ValidarCreditAvalible
  Scenario: Validar el credit avalible en el home
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido el credit avalible de "17.800"

  @ValidarValoresPositivoVerde
  Scenario: Validar los valores positivos de la columna amount sean verdes
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido contengan el carecter "+" con formato "text-success"

  @ValidarValoresNegativos
  Scenario: Validar los valores negativos de la columna amount sean rojos
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido contengan el carecter "-" con formato "text-danger"

  @ValidarEstatusCompletado
  Scenario: Validar estado completado color verde
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido el estado "Complete" con color "smaller green"

  @ValidarEstatusDeclinado
  Scenario: Validar estado declinado color rojo
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido el estado "Declined" con color "smaller red"

  @ValidarEstatusPendiente
  Scenario: Validar estado pendiente color amarillo
    Given como "usuario" deseo loguearme
    When las credenciales usuario "testuser" y contrasena "testpasword"
    Then valido el estado "Pending" con color "smaller yellow"