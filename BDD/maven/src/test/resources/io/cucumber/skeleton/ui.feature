Feature: UserInterface
  Scenario: Przełączenie do zakładki Products, Cart oraz Home
    Given Widoczna strona główna sklepu
    When Przechodzę do Products
    And Przechodzę do Cart
    Then Wracam do Home