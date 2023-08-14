Feature: Login to EC page

  Scenario Outline: Verify the pending participant page information
    Given Url of the EC page
    When User enters the "<Username>" and "<Password>"
    And User in home page

    Examples:
      | Username | Password |
      | TestTrader | 1ncharge |

  Scenario: Verify the details of participants
    Then User navigated to pending participant page
    And Verify the participant details of the event.