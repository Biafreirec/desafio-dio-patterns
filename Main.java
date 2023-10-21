class Main {
  public static void main(String[] args) {
    MysqlCommands mysqlCMDs = new MysqlCommands();
    mysqlCMDs.Insert();
    PostgresCommands psqlCMDs = new PostgresCommands();
    PostgresAdapter psqlAdapter = new PostgresAdapter(psqlCMDs);
    psqlAdapter.Insert();
  }
}