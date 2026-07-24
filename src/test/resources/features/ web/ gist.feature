Feature: GitHub Gist CRUD

  @TC001
  Scenario: Create Secret Gist
    When User membuat secret gist
    Then Secret gist berhasil dibuat

  @TC002
  Scenario: Create Gist Without Description
    When User membuat gist tanpa description
    Then Gist berhasil dibuat

  @TC003
  Scenario: Create Gist Without Filename
    When User membuat gist tanpa filename
    Then Gist gagal dibuat

  @TC004
  Scenario: Create Gist Without Content
    When User membuat gist tanpa content
    Then Gist gagal dibuat

  @TC005
  Scenario: View Detail Gist
    Given User sudah memiliki gist
    When User membuka detail gist
    Then Detail gist berhasil ditampilkan

  @TC006
  Scenario: Verify Edit Button
    Given User sudah memiliki gist
    When User membuka detail gist
    Then Tombol edit tersedia

  @TC007
  Scenario: Verify Delete Button
    Given User sudah memiliki gist
    When User membuka detail gist
    Then Tombol delete tersedia

  @TC008
  Scenario: Open Existing Gist
    Given User sudah memiliki gist
    When User membuka detail gist
    Then Gist berhasil dibuka

  @TC009
  Scenario: View Gist Detail
    Given User sudah memiliki gist
    When User membuka detail gist
    Then Detail gist berhasil ditampilkan

  @TC010
  Scenario: Create Multiple Gists
    When User membuat dua gist
    Then Dua gist berhasil dibuat