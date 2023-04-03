@Cicle @Chat
Feature: Chat Feature

  @PositiveCase @RegressionTest @TC1
  Scenario:Verify user successfully send a message
    Given User on the chat group page
    When User send "Ayam"
    Then Last message is "Ayam"

  @PositiveCase @RegressionTest @TC2
  Scenario: Verify user successfully mention user in group chat
    Given User on the chat group page
    When User tag mention to "yantoegi65@gmail.com"
    Then User successfully mention

  @PositiveCase @RegressionTest @TC3
  Scenario: Verify user successfully attach file image from gallery in group chat
    Given User on the chat group page
    When User add file image
    Then User successfully add file image

  @PositiveCase @RegressionTest @TC4
  Scenario: Verify user successfully sent text in personal chat
    Given User on the team group page
    When User send text "Testing Personal Chat"
    Then User successfully send text message is "Testing Personal Chat"

  @PositiveCase @RegressionTest @TC5
  Scenario: Verify user successfully send file image from gallery in personal chat
    Given User on the team group page
    When User add file image < 1 mb
    Then User successfully send file image

  @NegatifCase @RegressionTest @TC1
  Scenario: Verify user unsuccessfully sent empty text in group chat
    Given User on the chat group page
    When User send empty "" text
    Then User unsuccessfully sent text chat in group chat

  @NegatifCase @RegressionTest @TC2
  Scenario: Verify user unsuccessfully sent html code in group chat
    Given User on the chat group page
    When User send html code "<p style="color:red">html code</p>"
    Then User unsuccessfully sent text html code "html code"

  @NegatifCase @RegressionTest @TC3
  Scenario: Verify user unsuccessfully attach file image from gallery with size > 25 mb in group chat
    Given User on the chat group page
    When User input file image
    Then User unsuccessfully input file in conversation group chat

  @NegatifCase @RegressionTest @TC4
  Scenario: Verify user unsuccessfully sent empty text
    Given User on the team group page
    When User send empty "" text in personal chat
    Then User unsuccessfully sent text

  @NegatifCase @RegressionTest @TC5
  Scenario: Verify user unsuccessfully input image from gallery with size > 25 mb in personal chat
    Given User on the team group page
    When User input image lebih dari 25 mb
    Then User unsuccessfully input file image