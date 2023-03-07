package com.example.mathtuitioncenter;

public class Main {
    public static void main(String args[]) {
        Database db = new Database(
                "db4free.net", "3306",
                "ooputpjan23",
                "nordin", "nrdinutp");
        db.connect();
        db.runQuery("select * from Student");

    }
}
