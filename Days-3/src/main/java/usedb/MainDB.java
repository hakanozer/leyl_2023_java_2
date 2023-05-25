package usedb;

import models.Note;
import services.NoteService;

import java.util.List;

public class MainDB {
    public static void main(String[] args) {

        NoteService noteService = new NoteService();

        /*
        Note note = new Note();
        note.setTitle("Toplantı");
        note.setDetail("Toplantı Detay");
        int status = noteService.noteSave(note);
        System.out.println("Status :" + status);
         */

        List<Note> notes = noteService.allNote();
        notes.forEach( item -> {
            System.out.println( item.getNid() + " " + item.getTitle() + " " + item.getDetail() );
        });

    }
}
