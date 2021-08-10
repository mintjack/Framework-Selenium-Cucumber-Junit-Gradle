Feature: Titles
Are pages titles present and correct?

  Scenario Outline:Page titles are correct
    Given a user navigates to Homepage "<page>"
    Then page title "<title>" is displayed
  Examples:
    | page | title |
    | /world-population | World Population Clock: 7.9 Billion People (2021) - Worldometer |
    | /computers        | Computers sold in the world this year - Worldometer            |

