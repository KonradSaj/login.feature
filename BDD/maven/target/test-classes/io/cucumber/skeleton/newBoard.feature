Feature: Board
  Scenario: Jako zalogowany użytkownik tworzę tablicę
    Given Jestem na stronie
    When Klikam Utwórz nową tablicę
    And Podaję tytuł tablicy
    And Klikam Utwórz
    Then Tworzy się nowa tablica