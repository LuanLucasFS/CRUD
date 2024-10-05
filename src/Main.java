import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("CRUDJava", "postgres", "dbadmin");
        //db.createTable(conn, "employee");
        //db.insert_row(conn, "employee", "Paul", "Greek");
        //db.update_name(conn, "employee", "John", "Joao");
        db.delete_row_by_name(conn,"employee", "Joao");
        db.read_data(conn, "employee");
        //db.search_by_name(conn,"employee", "Paul");
    }
}