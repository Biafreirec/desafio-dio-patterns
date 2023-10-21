public class MysqlCommands implements DBAdapter {

  @Override
  public void Insert() {
    System.out.println("Mysql Inserting");
  }

  @Override
  public void Update() {
    System.out.println("Mysql Updating");
  }

  @Override
  public void Delete() {
    System.out.println("Mysql Deleting");
  }

}