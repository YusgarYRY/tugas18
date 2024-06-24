Feature: positif, negatif, and boundary api test on reqres.in

  Scenario: positif test on reqres.in by post method
    Given prepare url valid for post new userid
    And Hit api post new user id
    Then verification status code should be 201

  Scenario: Negatif test on reqres.in by get method
    Given prepare url valid for get user id
    And Hit api get Invalid user id
    Then verification status code should be 404

    Scenario: Boundary test on reqres by get method
      Given prepare url valid for post minimum lenght for name
      And Hit api post with single carachter for name
      Then verification status code should be 201 for minimum lenght