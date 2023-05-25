package services;

import models.Note;
import usedb.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NoteService {

    public int noteSave(Note note) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "insert into \"Note\" (title, detail) values( ?, ? )";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            pre.setString(1, note.getTitle());
            pre.setString(2, note.getDetail());
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("noteSave error : " + ex);
        }finally {
            db.close();
        }
        return status;
    }


    public List<Note> allNote() {
        List<Note> notes = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from \"Note\" ";
            PreparedStatement pre = db.conn().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while ( rs.next() ) {
                int nid = rs.getInt("nid");
                String title = rs.getString("title");
                String detail = rs.getString("detail");
                Note note = new Note(nid, title, detail);
                notes.add(note);
            }
        }catch (Exception ex) {
            System.err.println("allNote Error :" + ex);
        }finally {
            db.close();
        }
        return notes;
    }


}
