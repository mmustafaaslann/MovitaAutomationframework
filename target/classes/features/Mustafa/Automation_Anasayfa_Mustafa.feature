Feature: Home Page

# click ol movito logaya tıkla Mobile Vechile Tracking system SHould be visible yazısını gör
  Scenario: movita logo
    Given   users goto url"https://movita.com.tr//"
    When    users clicked the movita logo
    And     Mobile Vechile Tracking system SHould be visible
    Then    Should be success



#Dropdown
#  1.Clickable olmali
#
#  2.Iki secenegi click yapinca:
#
#  English → “Mobile Vehicle Tracking System” yazisini verify et
#
#  Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et
  Scenario: giris yap
    Given users navigate to "https://movita.com.tr//"
    When  user clicks the enter button
    And   user clicks the Turkish language button
    And   user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et


    When  user clicks the enter button
    And   user clicks the english language button
    And   user String verify English → “Mobile Vehicle Tracking System” yazisini verify et
