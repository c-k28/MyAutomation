Feature: Checking the tags of the cucumber

  @searchsite
  Scenario: searc

  h site
    Given This is the google site

  @mailsite
  Scenario: Mail site
    Given This is the Gmail site

  @onlineordersite @searchsite
  Scenario: Online order site
    Given This is the flipkart site

  @onlineordersite @tag3
  Scenario: Another order site
    Given This is the amazon site

  @searchsite
  Scenario: bing search
    Given  This is the bing search site

  @socialmediasite @tag3
  Scenario: Social media site
    Given This is the facebook site

  @socialmediasite
  Scenario: Social insta site
    Given This is the instagram site