Feature: Login

  Scenario: Logowanie na poprawne dane
    And OpenBrowser
    Given Wchodzę na strone
    When Wpisuję email i klikam kontynuuj
    And Wpisuję hasło "QWEqwe12!" i klikam Zaloguj się
    Then Zostaje zalogowany


  Scenario: Logowanie na niepoprawne dane
    And OpenBrowser
    Given Wchodzę na strone
    When Wpisuję email i klikam kontynuuj
    And Wpisuję hasło "QWEqwe" i klikam Zaloguj się
    Then Nie zostaje zalogowany

