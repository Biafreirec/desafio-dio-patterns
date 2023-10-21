public class PostgresAdapter implements DBAdapter {
  private PostgresCommands psqlCommands;
  public PostgresAdapter(PostgresCommands psqlCommands) {
    this.psqlCommands = psqlCommands;
  }
  @Override
  public void Insert() {
    this.psqlCommands.InsertPSQL();
  }
  @Override
  public void Update() {
    this.psqlCommands.UpdatePSQL();
  }
  @Override
  public void Delete() {
    this.psqlCommands.DeletePSQL();
  }
}