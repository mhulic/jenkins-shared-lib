def call(){
    sh """
     docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=Passwort01&"  --name sql2022onUbuntu20.04 -p 1433:1433 -d mcr.microsoft.com/mssql/server:2022-latest
    """
}