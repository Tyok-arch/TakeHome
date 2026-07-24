Feature: ReqRes API User

  @TCAPI001
  Scenario: Mendapatkan data user berdasarkan ID
  Ketika User mengirim request GET user berdasarkan ID
  Maka Status code harus 200

  @TCAPI002
  Scenario: Mendapatkan daftar user
  Ketika User mengirim request GET daftar user
  Maka Status code harus 200

  @TCAPI003
  Scenario: Membuat data user baru
  Ketika User mengirim request POST create user
  Maka Status code harus 201

  @TCAPI004
  Scenario: Mengubah data user
  Ketika User mengirim request PUT update user
  Maka Status code harus 200

  @TCAPI005
  Scenario: Menghapus data user
  Ketika User mengirim request DELETE user
  Maka Status code harus 204